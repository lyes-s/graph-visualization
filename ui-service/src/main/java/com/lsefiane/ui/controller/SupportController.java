package com.lsefiane.ui.controller;

import com.lsefiane.ui.domain.Support;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/support")
public class SupportController {

    @GetMapping
    public String complaintForm(Model model) {
        model.addAttribute("supportDetails", new Support());
        return "support";
    }

    @PostMapping
    public String submitComplaintForm(@Valid @ModelAttribute("supportDetails") Support supportDetails, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("supportDetails", supportDetails);
            return "support";
        }
        redirectAttributes.addFlashAttribute("success", "Successfully Submitted.");
        return "redirect:/support";
    }

}
