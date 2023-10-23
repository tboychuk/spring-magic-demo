package com.bobocode.service;

import lombok.SneakyThrows;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @SneakyThrows
    @Async
    public void notifyUser(String user) {
        System.out.println("Sending a message to " + user);
        System.out.println(Thread.currentThread().getName());
        Thread.sleep(3000);
    }
}
