package com.cloud.nacosfront.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author 22110334
 */
@Component
public class MyConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getMyRestTemplate(){
        return new RestTemplate();
    }
}
