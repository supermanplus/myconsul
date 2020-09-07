package com.lv.consul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lvzunchao
 * @date 2020/9/7-15:40
 **/
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    public String serverPort;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Consul from : " + serverPort;
    }
}
