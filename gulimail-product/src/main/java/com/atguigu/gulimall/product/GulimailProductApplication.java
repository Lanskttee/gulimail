package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.gulimall.product.dao")
public class GulimailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailProductApplication.class, args);
    }

}
