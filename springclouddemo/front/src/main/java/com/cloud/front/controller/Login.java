package com.cloud.front.controller;

import com.cloud.common.entity.ResultData;
import com.cloud.common.pojo.TestUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 22110334
 */
@Controller
@Slf4j
public class Login {
    @Resource
    private RestTemplate restTemplate;

    private String myURL="http://BACKSTAGE";

    @GetMapping("/front/login.do/{username}/{password}")
    public @ResponseBody String login(@PathVariable("username") String username,@PathVariable("password") String password){
        String url =myURL+"/backStageOne/login.do";
        TestUser testUser = new TestUser(0,username,password);
        log.info("front-post:"+testUser);
        return restTemplate.postForObject(url,testUser,String.class,testUser);
    }

    @GetMapping("/front/get.do/{username}")
    public @ResponseBody String getUser(@PathVariable("username") String username){
        String url =myURL+"/backStageOne/get/"+username;
        log.info("front:"+username);
        log.info(url);
        return restTemplate.getForObject(url, String.class);
    }
}
