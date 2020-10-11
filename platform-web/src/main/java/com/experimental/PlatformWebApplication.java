package com.experimental;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.experimental")
public class PlatformWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformWebApplication.class, args);
    }

}
