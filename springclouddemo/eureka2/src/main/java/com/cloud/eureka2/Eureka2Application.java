package com.cloud.eureka2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 22110334
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka2Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka2Application.class, args);
    }

}
