package ru.kata.spring.boot_security.demo.controller;

import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
    @RequestMapping ("/login")
    public String login(Model model) {
        return "login";
    }

    @RequestMapping("/")
    public String redirectToLoginPage() {
        return "redirect:/login";
    }
}
