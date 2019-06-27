package com.dunzung.alibaba.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Created by Wooola on 2019/6/26.
 */
@RestController
@RequestMapping("/config")
@RequestScope
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @GetMapping
    public boolean get() {
        return useLocalCache;
    }

}
