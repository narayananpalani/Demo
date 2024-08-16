package com.software.club.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class AboutController {

    @GetMapping("about")
    public String greeting(Map<String, Object> model) {
        model.put("message", "This is a demo software of club");
        return "about";
    }

}
