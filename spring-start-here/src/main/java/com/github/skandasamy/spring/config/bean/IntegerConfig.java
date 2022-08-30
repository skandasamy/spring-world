package com.github.skandasamy.spring.config.bean;

import org.springframework.context.annotation.Bean;

public class IntegerConfig {
    @Bean
    public Integer ten() {
        return Integer.valueOf(10);
    }
}
