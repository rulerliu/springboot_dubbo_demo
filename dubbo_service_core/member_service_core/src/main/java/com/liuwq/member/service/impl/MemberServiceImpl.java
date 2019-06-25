package com.liuwq.member.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.liuwq.member.service.MemberService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/25 0025 下午 3:51
 * @version: V1.0
 */
@Service
@RestController
public class MemberServiceImpl implements MemberService {

    @Override
    public String getUser() {
        return "订单服务调用会员服务接口";
    }
}
