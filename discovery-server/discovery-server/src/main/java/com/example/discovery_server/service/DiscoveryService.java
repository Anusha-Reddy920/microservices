package com.example.discovery_server.service;

import org.springframework.stereotype.Service;

@Service
public class DiscoveryService {

    public String getInfo() {
        return "Eureka Discovery Server";
    }
}
