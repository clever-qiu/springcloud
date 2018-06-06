package com.yangqiu.eurekafeign.controller;

import com.yangqiu.eurekafeign.service.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    ConsumerClient consumerClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return consumerClient.add(10, 20);
    }

}