package com.weibo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WeibouesrApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeibouesrApplication.class, args);
    }
}
