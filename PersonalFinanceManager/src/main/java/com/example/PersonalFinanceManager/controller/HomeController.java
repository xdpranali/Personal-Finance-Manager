package com.example.PersonalFinanceManager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // This will look for a file named 'index.html' in src/main/resources/templates/
    }
}
