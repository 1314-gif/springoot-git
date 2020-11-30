package com.entor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String helle(){
        return "hello";
    }
    @RequestMapping("/get")
    public  String get(){
        return "get";
    }
    @RequestMapping("/set")
    public String set(){
        return "set";
    }
}
