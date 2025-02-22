package com.eazybytes.springsecurity.infraestructure.rest.api.notice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {

    @GetMapping("/notices")
    public String getNotice() {
        return "Here are the notices details from the DB";
    }
}
