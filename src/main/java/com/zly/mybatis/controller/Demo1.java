package com.zly.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo1 {

    @GetMapping("test1")
    private String test1() {
        return "Hello World Test1";
    }
}
