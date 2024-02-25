package com.example.hsconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HsConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(HsConfigApplication.class, args);
    }

}
