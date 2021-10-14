FROM maven:3-amazoncorretto-11 as builder
WORKDIR /ui-service/workspace
COPY ui-service/pom.xml  /ui-service/workspace
COPY ui-service/src  /ui-service/workspace/src
RUN mvn clean install


FROM amazoncorretto:11-alpine
LABEL maintainer=lyes.sefiane@gmail.com
WORKDIR /ui-service
COPY --from=builder /ui-service/workspace/target/ui-service-0.0.1-SNAPSHOT.jar /ui-service/ui-service.jar
RUN apk add --update curl && \
    rm -rf /var/cache/apk/* && \
    rm -rf /ui-service/workspace
EXPOSE 8080
ENTRYPOINT ["java","-jar","ui-service.jar"]