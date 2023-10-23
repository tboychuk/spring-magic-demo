package com.bobocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;

@EnableAsync
@SpringBootApplication
public class SpringMagicDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMagicDemoApplication.class, args);
    }

    @Scheduled(fixedDelay = 2000L)
    public void scheduleHello() {
        System.out.println("Hi again!");
    }

}
