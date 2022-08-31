package com.github.skandasamy.spring.bean;

import com.github.skandasamy.spring.data.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ParrotConfig {

    @Bean
    public Parrot parrot() {
        return new Parrot("Koko");
    }

}
