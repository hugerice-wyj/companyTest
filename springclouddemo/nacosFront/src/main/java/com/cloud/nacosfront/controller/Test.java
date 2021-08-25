package com.cloud.nacosfront.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author 22110334
 */
@RestController
public class Test {

    @Resource
    private RestTemplate restTemplate;

    private String baseURL="http://nacos";

    @GetMapping("/front/get/{test}")
    public String getBackstage(@PathVariable String test){
        return restTemplate.getForObject(baseURL+"/nacos/get/"+test,String.class);
    }
}
