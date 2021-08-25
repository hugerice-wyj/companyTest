package com.cloud.backstage1.controller;

import com.cloud.backstage1.service.TestUserService;
import com.cloud.common.entity.ResultData;
import com.cloud.common.pojo.TestUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 22110334
 */
@Controller
@Slf4j
public class Login {
    @Resource
    private TestUserService testUserService;
    @Value("${server.port}")
    private String server_port;

    @PostMapping("/backStageOne/login.do")
    public @ResponseBody String login(@RequestBody TestUser testUser){
        ResultData<TestUser> resultData ;
        log.info("backstage1-post:"+testUser);
        log.info(server_port);
        boolean f=testUserService.login(testUser.getUsername(),testUser.getPassword());
        if(f){ resultData = new ResultData(200,"登陆成功,server.port:"+server_port); }
        else{ resultData = new ResultData(500,"登陆失败,server.port:"+server_port); }
        return resultData.toString();
    }

    @GetMapping("/backStageOne/get/{user}")
    public @ResponseBody String getUser(@PathVariable("user") String username){
        log.info("backstage1:"+username);
        log.info(server_port);
        TestUser user = testUserService.getTestUserByUsername(username) ;
        ResultData<TestUser> resultData = user != null ? new ResultData(200,"登陆成功,server.port:"+server_port,user) : new ResultData(500,"未找到数据,server.port:"+server_port) ;
        return resultData.toString();
    }

}
