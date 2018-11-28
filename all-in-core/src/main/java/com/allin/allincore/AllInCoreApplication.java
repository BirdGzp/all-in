package com.allin.allincore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AllInCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllInCoreApplication.class, args);
    }
}
