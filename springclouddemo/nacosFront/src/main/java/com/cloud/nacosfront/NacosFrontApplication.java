package com.cloud.nacosfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 22110334
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosFrontApplication.class, args);
    }

}
