package com.liu.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.liu.project")
@MapperScan(basePackages = "com.liu.project.dao")
// @MapperScan(basePackages = "com.liu.project.mapper")
public class DemoControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoControllerApplication.class, args);
    }

}


