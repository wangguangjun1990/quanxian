package com.wang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2016/10/10.
 */
@SpringBootApplication
@ComponentScan({"com.wang.services","com.wang.controller","com.fc"})
@MapperScan("com.wang.mapper")
public class StartSpring extends SpringBootServletInitializer {
    public static void main(String[] args){
        SpringApplication.run(StartSpring.class, args);
        System.out.println("启动了");
    }

}
