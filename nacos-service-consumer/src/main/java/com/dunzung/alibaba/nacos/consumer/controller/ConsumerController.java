package com.dunzung.alibaba.nacos.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Wooola on 2019/6/27.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/providers/{providerId}")
    public String getProvider(@PathVariable("providerId") String providerId) {
        return restTemplate.getForObject("http://nacos-service-provider/providers/" + providerId, String.class);
    }


}
