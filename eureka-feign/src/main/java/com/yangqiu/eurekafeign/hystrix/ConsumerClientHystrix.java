package com.yangqiu.eurekafeign.hystrix;

import com.yangqiu.eurekafeign.service.ConsumerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ConsumerClientHystrix implements ConsumerClient {

    @Override
    public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return -9999;
    }

}