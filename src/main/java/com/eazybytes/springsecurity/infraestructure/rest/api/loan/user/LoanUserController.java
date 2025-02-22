package com.eazybytes.springsecurity.infraestructure.rest.api.loan.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanUserController {

    @GetMapping("/myLoans")
    public String getLoanUserDetails() {
        return "Here are the loan details from the DB";
    }
}
