package com.eazybytes.springsecurity.infraestructure.rest.api.account;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.eazybytes.springsecurity.infraestructure.commom.AccountUrlCommom.ACCOUNT_URL;


@RestController
public class AccountController {

    @GetMapping(ACCOUNT_URL)
    public String getAccountDetails() {
        return "Here are the account details from the DB";
    }
}
