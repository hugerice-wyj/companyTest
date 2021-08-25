package com.cloud.backstage.controller;

import com.cloud.backstage.service.TestUserService;
import com.cloud.common.entity.ResultData;
import com.cloud.common.pojo.TestUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 22110334
 */
@Controller
@Slf4j
public class Login {
    @Resource
    private TestUserService testUserService;
    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String  server_port;


    @GetMapping("backStage/test")
    public Object getDiscovery(){
        List<String> services=discoveryClient.getServices();
        System.out.println(server_port);
        System.out.println("******** services ************");
        for(String e : services){
            System.out.println(e);
        }
        List<ServiceInstance> instances=discoveryClient.getInstances("backstage");
        System.out.println("******** instances ************");
        for(ServiceInstance e : instances){
            System.out.println(e.getServiceId()+"--"+e.getHost()+"--"+e.getPort()+"--"+e.getUri());
        }
        return this.discoveryClient;
    }



    @PostMapping("/backStage/login.do")
    public @ResponseBody String login(@RequestBody TestUser testUser){
        ResultData<TestUser> resultData ;
        log.info("backstage-post:"+testUser);
        log.info(server_port);
        boolean f=testUserService.login(testUser.getUsername(),testUser.getPassword());
        if(f){ resultData = new ResultData(200,"登陆成功"); }
        else{ resultData = new ResultData(500,"登陆失败"); }
        return resultData.toString();
    }

    @GetMapping("/backStage/get/{user}")
    public @ResponseBody String getUser(@PathVariable("user") String username){
        log.info("backstage:"+username);
        log.info(server_port);
        TestUser user = testUserService.getTestUserByUsername(username) ;
        ResultData<TestUser> resultData = user != null ? new ResultData(200,"登陆成功",user) : new ResultData(500,"未找到数据") ;
        return resultData.toString();
    }

}
