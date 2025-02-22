package com.eazybytes.springsecurity.infraestructure.rest.api.account;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccount")
    public String getAccountDetails() {
        return "Here are the account details from the DB";
    }
}
