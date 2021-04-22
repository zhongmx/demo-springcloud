package com.fengabner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient // 开启服务发现
@EnableFeignClients(basePackages = "com.fengabner.**") // 开启Feign
public class DemoUserConsumerFeignServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoUserConsumerFeignServerApplication.class, args);
    }

}
