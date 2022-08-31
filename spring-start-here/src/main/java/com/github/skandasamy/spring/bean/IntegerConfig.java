package com.github.skandasamy.spring.bean;

import org.springframework.context.annotation.Bean;

public class IntegerConfig {
    @Bean
    public Integer ten() {
        return Integer.valueOf(10);
    }
}
