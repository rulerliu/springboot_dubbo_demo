package com.liuwq.order.service;

import org.springframework.web.bind.annotation.RequestMapping;

public interface OrderService {

    @RequestMapping("/orderToMember")
    String orderToMember();

}
