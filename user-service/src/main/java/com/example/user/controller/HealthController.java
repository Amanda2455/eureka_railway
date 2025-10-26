package com.example.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public Map<String, String> home() {
        Map<String, String> response = new HashMap<>();
        response.put("service", applicationName);
        response.put("status", "UP");
        response.put("port", port);
        response.put("message", "User Service is running!");
        return response;
    }
}