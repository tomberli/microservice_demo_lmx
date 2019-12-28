package com.lmx.microservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //标识配置类
public class ConfigBean {

    @LoadBalanced //负载均衡注解
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
