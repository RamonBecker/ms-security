package com.eazybytes.springsecurity.infraestructure.rest.api.notice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.eazybytes.springsecurity.infraestructure.rest.api.notice.commom.NoticeUrlCommom.NOTICE_URL;

@RestController
public class NoticeController {

    @GetMapping(NOTICE_URL)
    public String getNotice() {
        return "Here are the notices details from the DB";
    }
}
