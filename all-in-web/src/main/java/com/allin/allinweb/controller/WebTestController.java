package com.allin.allinweb.controller;

import com.allin.allinweb.feign.WebTestFeign;
import com.allin.allinweb.service.WebTestService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebTestController {
    @Autowired
    WebTestService webTestService;


    @Autowired
    WebTestFeign webTestFeign;

    @GetMapping(value = "/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(@RequestParam String name) {
        //http://localhost:8900/hi?name=123
        //return webTestService.hiService(name);

        return webTestFeign.sayHiFromClientOne(name);
    }

    public String hiError(String name){
        return "hi a error";
    }

}
