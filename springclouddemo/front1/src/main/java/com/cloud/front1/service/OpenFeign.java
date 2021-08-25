package com.cloud.front1.service;

import com.cloud.common.entity.ResultData;
import com.cloud.common.pojo.TestUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 22110334
 */
@Component
@FeignClient(value = "BACKSTAGE")
public interface OpenFeign {

    /**
     * openFeign 的service，加载指定服务的外用接口
     * @param username
     * @return
     */
    @GetMapping("/backStageOne/get/{user}")
    String getUser(@PathVariable("user") String username);
}
