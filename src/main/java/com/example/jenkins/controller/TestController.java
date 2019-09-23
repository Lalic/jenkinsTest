package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: YYF
 * @Date: 2019/9/23 10:49
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String Test(){
        return "Hello Jenkins";
    }
}
