package com.github.skandasamy.spring.config.bean;

import org.springframework.context.annotation.Bean;

public class StringConfig {
    @Bean
    public String hello() {
        return "Hello";
    }
}
