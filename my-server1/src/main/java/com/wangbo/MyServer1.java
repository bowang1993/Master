package com.wangbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@EnableEurekaClient
@SpringBootApplication
public class MyServer1 {
    public static void main(String[] args) {
        SpringApplication.run(MyServer1.class, args);
    }
}
