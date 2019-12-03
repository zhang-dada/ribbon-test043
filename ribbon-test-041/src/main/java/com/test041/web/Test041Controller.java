package com.test041.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.test041.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test041Controller {

    @Autowired
    private TestApi testApi;

    @RequestMapping("test2/{name}")
    @HystrixCommand(fallbackMethod = "testback")
    public String test(@PathVariable String name){
        return testApi.test01(name);
    }

    public String testBack(String name){
        return "出错了参数--》"+name;
    }
}
