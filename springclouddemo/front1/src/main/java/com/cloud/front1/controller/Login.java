package com.cloud.front1.controller;

import com.cloud.common.entity.ResultData;
import com.cloud.common.pojo.TestUser;
import com.cloud.front1.service.OpenFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 22110334
 */
@RestController
@Slf4j
public class Login {
    @Resource
    private OpenFeign openFeign;

    @GetMapping("/openFeign/get/{user}")
    public @ResponseBody
    String getUserById(@PathVariable("user") String username){
        return openFeign.getUser(username);
    }
}
