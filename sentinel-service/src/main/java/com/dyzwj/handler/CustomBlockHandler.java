package com.dyzwj.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * 自定义BlockHandler限流处理类
 *  说明: 必须是static静态方法
 */
public class CustomBlockHandler {
    public static String customBlockHandlerMethodA(BlockException exception) {
        return "[客户自定义限流处理逻辑]--->customBlockHandlerMethodA";
    }

    public static String customBlockHandlerMethodB(BlockException exception) {
        return "[客户自定义限流处理逻辑]--->customBlockHandlerMethodB";
    }
}