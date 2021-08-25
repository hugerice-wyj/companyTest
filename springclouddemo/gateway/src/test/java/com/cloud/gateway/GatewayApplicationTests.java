package com.cloud.gateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;
import java.util.TimeZone;

@SpringBootTest
class GatewayApplicationTests {

    @Test
    void contextLoads() {
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }

}
