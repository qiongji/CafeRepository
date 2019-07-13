package com.zzzy.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zzzy.controller")
@ComponentScan("com.zzzy.service")
@ComponentScan("com.zzzy.serviceimpl")
@MapperScan("com.zzzy.idao")

public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
