package com.cloud.sentinel.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.common.entity.ResultData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 22110334
 */
@RestController
@RefreshScope
public class MyTest {

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/getInfo")
    public String getConfigInfo(){
        return configInfo;
    }

    @GetMapping("/test1")
    @SentinelResource(value = "sentinel",blockHandler = "sentinelBH")
    public String test1(){
        return "服务降级测试";
    }

    private ResultData sentinelBH(BlockException blockException){
        return new ResultData(500,blockException.getClass().getCanonicalName()+"服务繁忙，请稍后再试!");
    }

}
