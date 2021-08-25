package com.cloud.front1.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 22110334
 */
@Component
public class MyFeiConfig {

    @Bean
    Logger.Level feiLevel(){
        return Logger.Level.FULL;
    }
}
