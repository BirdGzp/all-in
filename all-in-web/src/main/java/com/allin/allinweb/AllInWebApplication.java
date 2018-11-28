package com.allin.allinweb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@RestController
public class AllInWebApplication {


    public static void main(String[] args) {
        SpringApplication.run(AllInWebApplication.class, args);
    }


    @Value("${foo}")
    String foo;

    @GetMapping("/config")
    public String config(){
        return foo;
    }

//    @Bean
//    @LoadBalanced
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
}
