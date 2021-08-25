package com.cloud.backstage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 22110334
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BackstageApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackstageApplication.class, args);
    }

}
