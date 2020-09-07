package com.lv.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lvzunchao
 * @date 2020/9/7-15:54
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMain8081 {

    public static void main(String[] args) {

        SpringApplication.run(ProviderMain8081.class,args);
    }
}
