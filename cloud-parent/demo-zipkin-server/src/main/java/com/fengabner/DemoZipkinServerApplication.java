package com.fengabner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer // 开启Zipkin 服务器功能
public class DemoZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoZipkinServerApplication.class, args);
    }

}
