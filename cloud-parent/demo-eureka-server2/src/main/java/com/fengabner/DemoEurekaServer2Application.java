package com.fengabner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoEurekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaServer2Application.class, args);
    }

}
