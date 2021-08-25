package com.cloud.front;

import com.cloud.ribbonRule.MyRibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author 22110334
 */
@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient( name = "BACKSTAGE", configuration = MyRibbonRule.class)
public class FrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontApplication.class, args);
    }

}
