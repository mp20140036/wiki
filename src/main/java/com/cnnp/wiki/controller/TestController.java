package com.cnnp.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangqiang
 * @create 2021-08-28
 * @email yangqiang@cnnp.com.cn
 */
@RestController
public class TestController {


    @Value("${test.hello}")
    private String testHello;

    @GetMapping("/hello")
    public String hello(){
        return "hello"+testHello;
    }



    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post，" + name;
    }

}
