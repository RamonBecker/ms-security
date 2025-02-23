package com.eazybytes.springsecurity.infraestructure.rest.api.loan.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.eazybytes.springsecurity.infraestructure.commom.LoanUserUrlCommom.LOAN_USER_URL;

@RestController
public class LoanUserController {

    @GetMapping(LOAN_USER_URL)
    public String getLoanUserDetails() {
        return "Here are the loan details from the DB";
    }
}
