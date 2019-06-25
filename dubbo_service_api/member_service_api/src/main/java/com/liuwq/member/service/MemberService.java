package com.liuwq.member.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface MemberService {

    @RequestMapping("/getUser")
    String getUser();

}
