package com.cloud.backstage2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 22110334
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Backstage2Application {

    public static void main(String[] args) {
        SpringApplication.run(Backstage2Application.class, args);
    }

}
