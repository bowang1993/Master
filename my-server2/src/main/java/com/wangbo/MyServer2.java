package com.wangbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@EnableEurekaClient
@SpringBootApplication
public class MyServer2 {
    public static void main(String[] args) {
        SpringApplication.run(MyServer2.class, args);
    }
}
