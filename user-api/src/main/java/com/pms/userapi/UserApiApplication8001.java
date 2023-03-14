package com.pms.userapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UserApiApplication8001 {

   

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication8001.class, args);
    }
}
