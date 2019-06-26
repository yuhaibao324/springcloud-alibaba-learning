package com.dunzung.alibaba.nacos.config.controller;

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
