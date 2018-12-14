package com.wangbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@EnableEurekaServer
@SpringBootApplication
public class ErurkaApp {
    public static void main(String[] args) {
        SpringApplication.run(ErurkaApp.class, args);
    }
}
