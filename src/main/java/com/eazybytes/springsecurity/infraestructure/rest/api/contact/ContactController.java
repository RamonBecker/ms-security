package com.eazybytes.springsecurity.infraestructure.rest.api.contact;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public String saveContact() {
        return "Contact saved successfully";
    }

}
