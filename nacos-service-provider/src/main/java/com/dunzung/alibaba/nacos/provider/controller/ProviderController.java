package com.dunzung.alibaba.nacos.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wooola on 2019/6/27.
 */
@RestController
public class ProviderController {

    @GetMapping("/providers/{providerId}")
    public String getProvider(@PathVariable("providerId") String providerId) {
        return "我是Provider::" + providerId;
    }

}
