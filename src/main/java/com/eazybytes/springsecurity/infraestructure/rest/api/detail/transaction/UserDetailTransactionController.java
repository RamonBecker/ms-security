package com.eazybytes.springsecurity.infraestructure.rest.api.detail.transaction;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.eazybytes.springsecurity.infraestructure.commom.UserDetailTransactionUrlCommom.TRASACTION_USER_DETAILS_URL;

@RestController
public class UserDetailTransactionController {

    @GetMapping(TRASACTION_USER_DETAILS_URL)
    public String getTransactionDetails() {
        return "Here are the transaction details from the DB";
    }
}
