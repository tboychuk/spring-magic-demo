package com.bobocode.service;

import lombok.RequiredArgsConstructor;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {
    private final UserService userService;
    
    @EventListener(ContextRefreshedEvent.class)
    public void demo() {
        userService.processUser("Ivan");
    }
}
