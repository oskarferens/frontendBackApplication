package com.example.demo.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ConnectionConfig {
    @Value("${back.api.endpoint}")
    private String backApiEndpoint;
}
