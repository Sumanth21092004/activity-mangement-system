package com.burak.studentmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {

    // Handle GET requests to "/contact"
    @GetMapping("/contact")
    public String showContactPage() {
        return "contact";  // "contact" refers to contact.html in the templates folder
    }
}
