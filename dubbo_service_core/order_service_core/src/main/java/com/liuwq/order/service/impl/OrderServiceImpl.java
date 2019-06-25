package com.liuwq.order.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.liuwq.member.service.MemberService;
import com.liuwq.order.service.OrderService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: liuwq
 * @date: 2019/6/25 0025 下午 4:00
 * @version: V1.0
 */
@Service
@RestController
public class OrderServiceImpl implements OrderService {

    @Reference
    private MemberService memberService;

    @Override
    public String orderToMember() {
        return  memberService.getUser();
    }
}
