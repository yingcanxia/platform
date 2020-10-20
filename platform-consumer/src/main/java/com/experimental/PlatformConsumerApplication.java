package com.experimental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class PlatformConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlatformConsumerApplication.class,args);
    }
}
