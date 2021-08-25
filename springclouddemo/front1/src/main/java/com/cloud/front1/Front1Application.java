package com.cloud.front1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 22110334
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class Front1Application {

    public static void main(String[] args) {
        SpringApplication.run(Front1Application.class, args);
    }

}
