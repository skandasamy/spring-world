package com.github.skandasamy.spring.bean;

import com.github.skandasamy.spring.data.Parrot;
import org.springframework.context.annotation.Bean;

public class MultiParrotConfig {


    @Bean
    public Parrot parrot1() {
        return new Parrot("Koko");
    }

    @Bean(name = "koko")
    public Parrot kokoParrot() {
        return new Parrot("Koko");
    }

    @Bean
    public Parrot parrot2() {
        return new Parrot("Miki");
    }

    @Bean(name = "miki")
    public Parrot mikiParrot() {
        return new Parrot("Miki");
    }

    @Bean
    public Parrot parrot3() {
        return new Parrot("Riki");
    }

    @Bean(name = "riki")
    public Parrot rikiParrot() {
        return new Parrot("Riki");
    }

}
