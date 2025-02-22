package com.eazybytes.springsecurity.infraestructure.rest.api.detail.transaction;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailTransactionController {

    @GetMapping("/myTransaction")
    public String getTransactionDetails() {
        return "Here are the transaction details from the DB";
    }
}
