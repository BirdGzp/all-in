package com.allin.allinweb.feign;

public class WebTestFeignFallBack implements WebTestFeign{
    @Override
    public String sayHiFromClientOne(String name) {
        return "error ";
    }
}
