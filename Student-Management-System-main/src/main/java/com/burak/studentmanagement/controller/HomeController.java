package com.burak.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Mapping for the /home URL
    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // This refers to home.html in the templates folder
    }

    // Optionally, you can also map the root URL ("/") to the home page if needed.
    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/home"; // Redirects to the /home endpoint
    }
}
