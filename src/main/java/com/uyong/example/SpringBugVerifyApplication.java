package com.uyong.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBugVerifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBugVerifyApplication.class, args);
        System.out.println("success");
    }

}
