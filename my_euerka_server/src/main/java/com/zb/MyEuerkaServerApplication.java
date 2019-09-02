package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 本地新开发的功能
@SpringBootApplication
@EnableEurekaServer
public class MyEuerkaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyEuerkaServerApplication.class, args);
    }

}
