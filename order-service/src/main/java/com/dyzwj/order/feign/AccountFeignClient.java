package com.dyzwj.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "account-service")
public interface AccountFeignClient {

    @PostMapping("/account")
    String decreaseAccount();
}
