package com.haiqi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.haiqi"})
public class HaiqiTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HaiqiTwoApplication.class,args);
    }
}
