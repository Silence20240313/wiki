package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//  TODO Controller层的注解
@RestController
public class TestController {
    @Value("${test.hello}")
    private String testHello;
    // TODO 要让方法变成一个接口 加注解@RequestMapping  支持所有的请求方式
    //  常见的http请求方式：get post put delete  查询/新增/修改/删除
    @GetMapping ("/hello")
    public String hello(){
        return "Hello World" + testHello;
    }
}
