package com.example.nacosclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosclientApplication.class, args);
    }

}
