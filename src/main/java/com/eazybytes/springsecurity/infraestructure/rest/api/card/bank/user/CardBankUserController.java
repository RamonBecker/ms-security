package com.eazybytes.springsecurity.infraestructure.rest.api.card.bank.user;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.eazybytes.springsecurity.infraestructure.commom.CardUrlCommom.CARD_URL;

@RestController
public class CardBankUserController {

    @GetMapping(CARD_URL)
    public String getCardBankDetails() {
        return "Here are the card bank details from the DB";
    }
}
