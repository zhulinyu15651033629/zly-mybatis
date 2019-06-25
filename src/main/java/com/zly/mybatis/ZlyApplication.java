package com.zly.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class ZlyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZlyApplication.class);
    }
}
