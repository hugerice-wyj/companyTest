package com.cloud.nacos1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 22110334
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Nacos1Application {

    public static void main(String[] args) {
        SpringApplication.run(Nacos1Application.class, args);
    }

}
