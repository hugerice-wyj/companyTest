package com.cloud.nacos1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 22110334
 */
@RestController
public class Test {
    @Value("${server.port}")
    private String server_port;

    @GetMapping("/nacos/get/{test}")
    public String getServer_port(@PathVariable String test){
        return server_port+test;
    }
}
