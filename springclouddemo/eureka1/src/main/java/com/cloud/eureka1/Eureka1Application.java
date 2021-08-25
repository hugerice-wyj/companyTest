package com.cloud.eureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 22110334
 */
@EnableEurekaServer
@SpringBootApplication
public class Eureka1Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka1Application.class, args);
    }

}
