package com.paulo.framework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.paulo.framework.dao")
public class FrameWorkApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrameWorkApplication.class,args);
    }
}
