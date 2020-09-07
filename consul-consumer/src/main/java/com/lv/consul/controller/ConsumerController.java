package com.lv.consul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lvzunchao
 * @date 2020/9/7-16:20
 **/
@RestController
public class ConsumerController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public Object getServices() {

        List<ServiceInstance> instances = discoveryClient.getInstances("consul-provider");
        System.out.println(instances.toString());
        return instances;
    }

    @GetMapping("/discover")
    public String discover(){
        return loadBalancerClient.choose("consul-provider").toString();
    }


}
