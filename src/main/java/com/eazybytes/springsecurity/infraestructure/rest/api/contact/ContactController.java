package com.eazybytes.springsecurity.infraestructure.rest.api.contact;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.eazybytes.springsecurity.infraestructure.commom.ContactUrlCommom.CONTACT_URL;

@RestController
public class ContactController {

    @GetMapping(CONTACT_URL)
    public String saveContact() {
        return "Contact saved successfully";
    }

}
