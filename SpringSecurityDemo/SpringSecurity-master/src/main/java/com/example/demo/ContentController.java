package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContentController {

    @GetMapping("/home")
    public String handleWelcome() {
        return "home";
    }

    @GetMapping("/admin/home")
    public String handleAdminHome() {
        return "admin";
    }

    @GetMapping("/user/home")
    public String handleUserHome() {
        return "user";
    }

    @GetMapping("/login")
    public String handleLogin() {
        return "custom_login";
    }
}
