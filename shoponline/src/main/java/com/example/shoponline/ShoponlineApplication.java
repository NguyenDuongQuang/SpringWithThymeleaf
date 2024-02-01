package com.example.shoponline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ShoponlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoponlineApplication.class, args);
    }

}
