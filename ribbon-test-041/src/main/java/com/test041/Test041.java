package com.test041;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
@EnableCircuitBreaker
@EnableHystrix
public class Test041 {
    public static void main(String[] args) {
        SpringApplication.run(Test041.class);
    }
    @RequestMapping("test01")
    public String trst01(){
        System.out.println("=======test41========");
        return "test41-ok";
    }
}
