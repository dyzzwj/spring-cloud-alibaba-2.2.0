package com.dyzwj.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.dyzwj.handler.CustomBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {
    /**
     * 根据资源名称进行限流
     */
    @GetMapping("/limitByResource")
    @SentinelResource(value = "limitByResource", blockHandler = "blockHandlerLimitByResource")
    public String limitByResource() {
        return "根据资源名称进行限流";
    }

    /**
     * 服务兜底降级方法
     */
    public String blockHandlerLimitByResource(BlockException exception) {
        return "服务不可用";
    }

    /**
     * 根据URL进行限流
     */
    @GetMapping("/limitByUrl")
    @SentinelResource(value = "limitByUrl")
    public String limitByUrl() {
        return "根据URL进行限流";
    }
    /**
     * 客户自定义限流处理逻辑
     * blockHandlerClass: 指定限流逻辑处理类
     * blockHandler: 指定限流处理方法, 对应blockHandlerClass处理类中的方法名称
     */
    @GetMapping("/customBlockHandler")
    @SentinelResource(value = "customBlockHandler",
            blockHandlerClass = CustomBlockHandler.class,
            blockHandler = "customBlockHandlerMethodA")
    public String customerBlockHandler() {
        return "客户自定义限流处理逻辑";
    }


}
