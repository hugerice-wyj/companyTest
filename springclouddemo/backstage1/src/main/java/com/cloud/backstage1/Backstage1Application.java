package com.cloud.backstage1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 22110334
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Backstage1Application {

    public static void main(String[] args) {
        SpringApplication.run(Backstage1Application.class, args);
    }

}
