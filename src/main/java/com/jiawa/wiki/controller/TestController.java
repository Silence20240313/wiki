package com.jiawa.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    // 接口 get put 都可以
    @RequestMapping("/hello")
    public String hello(){
        return  "Hello World";
    }
}
