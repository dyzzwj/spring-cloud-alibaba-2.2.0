package com.dyzwj.order.controller;

import com.dyzwj.order.feign.StorageFeignClient;
import com.dyzwj.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;


    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    StorageFeignClient storageFeignClient;


    @PostMapping("/order")
    public String insertOrder(){
        orderService.insert();
        return "order";
    }

    @PostMapping("/addOrder")
    public String addOrder(){

        ServiceInstance choose = loadBalancerClient.choose("storage-service");
        String url = choose.getUri() + "/decreaseStorage";
        RestTemplate restTemplate = new RestTemplate();
        String s = restTemplate.postForObject(url, null, String.class);
        return s;
    }

    @Value("${service.vgroupMapping.my_test_tx_group}")
    private String group;

    @GetMapping("/property")
    public String property(){
        return group;
    }




}
