package com.upgrad.course.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.upgrad.course.demo"})
public class OrderApiMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderApiMain.class, args);
    }
}
