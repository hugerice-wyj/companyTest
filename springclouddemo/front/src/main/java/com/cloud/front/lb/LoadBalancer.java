package com.cloud.front.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author 22110334
 */
public interface LoadBalancer {
    /**
     * 手动创建负载轮换规则
     * @param serviceInstanceList service 服务列表
     * @return 一个服务
     */
    ServiceInstance instance(List<ServiceInstance> serviceInstanceList);
}
