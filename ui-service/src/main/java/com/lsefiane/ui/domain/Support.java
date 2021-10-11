package com.lsefiane.ui.domain;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Support
 */
public class Support {

    @NotBlank(message = "Full Name should not be empty.")
    private String fullName;

    @NotBlank(message = "Email should not be empty.")
    @Email(message = "Please provide a valid email.")
    private String emailAddress;

    @NotBlank(message = "Email Subject should not be empty.")
    private String emailSubject;

    @NotBlank(message = "Message should not be empty.")
    private String message;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {

        return "Support{" +
                "fullName='" + fullName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", emailSubject='" + emailSubject + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
