package com.software.club.controller;

import com.software.club.model.DemoRegistration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DemoRegistrationController {

    @GetMapping("demoregistration")
    public String getRegistration(@ModelAttribute ("registration") DemoRegistration demoregistration) {

        return "demoregistration";
    }

    @PostMapping("demoregistration")
    public String addRegistration(@ModelAttribute ("registration") DemoRegistration demoregistration) {
        System.out.println("Registration: " + demoregistration.getName());
        return "demoregistration";
    }
}
