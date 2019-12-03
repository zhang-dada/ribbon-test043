package com.test042;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Test042 {
    public static void main(String[] args) {
        SpringApplication.run(Test042.class);
    }

    @RequestMapping("test042")
    public String test041(){
        System.out.println("=====test1=======");
        return "test42-ok";
    }
}
