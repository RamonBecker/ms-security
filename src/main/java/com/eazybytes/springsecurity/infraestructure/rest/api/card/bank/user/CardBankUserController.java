package com.eazybytes.springsecurity.infraestructure.rest.api.card.bank.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardBankUserController {

    @GetMapping("/myCards")
    public String getCardBankDetails() {
        return "Here are the card bank details from the DB";
    }
}
