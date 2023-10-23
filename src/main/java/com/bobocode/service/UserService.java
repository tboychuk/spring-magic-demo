package com.bobocode.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final NotificationService notificationService;

    public void processUser(String user) {
        System.out.println("Start processing user: "+user);
        System.out.println(Thread.currentThread().getName());
        notificationService.notifyUser(user);
        System.out.println("End processing user: "+user);
    }
}
