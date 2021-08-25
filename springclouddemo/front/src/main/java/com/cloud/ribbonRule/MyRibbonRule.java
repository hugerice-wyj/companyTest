package com.cloud.ribbonRule;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @author 22110334
 */
@Configuration
public class MyRibbonRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
