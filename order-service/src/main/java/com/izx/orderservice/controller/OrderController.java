package com.izx.orderservice.controller;

import com.izx.orderservice.entity.Order;
import com.izx.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/create")
    public Boolean create(String userId, String commodityCode, Integer count) {

        orderService.create(userId, commodityCode, count);
        return true;
    }

    @GetMapping
    public List<Order> findAll(){
        return orderService.findAll();
    }
}
