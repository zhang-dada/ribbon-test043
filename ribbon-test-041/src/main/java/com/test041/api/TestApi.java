package com.test041.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="ribbon",fallback = TestFallBackApi.class)
public interface TestApi {
    @RequestMapping("test01")
    public String test01(@RequestParam("name")String name);
}
