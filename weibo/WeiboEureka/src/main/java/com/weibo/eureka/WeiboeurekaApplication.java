package com.weibo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WeiboeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeiboeurekaApplication.class, args);
    }
}
