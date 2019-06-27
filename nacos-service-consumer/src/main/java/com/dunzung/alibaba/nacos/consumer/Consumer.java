package com.dunzung.alibaba.nacos.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Wooola on 2019/6/27.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Consumer {

    public static void main(String[] args) {
        SpringApplication.run(Consumer.class, args);
    }

}
