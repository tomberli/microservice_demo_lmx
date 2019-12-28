package com.lmx.microservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //开启eureka客户端功能
@MapperScan("com.lmx.microservice.mapper")
@SpringBootApplication
public class ProductProvider_8002 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8002.class, args);
    }

}
