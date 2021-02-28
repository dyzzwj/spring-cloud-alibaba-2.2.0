package com.dyzwj.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "storage-service")
public interface StorageFeignClient {

    @PostMapping("/addStorage")
    String addStorage();
}
