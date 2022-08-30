package com.github.skandasamy.spring.config.stereotypes;

import com.github.skandasamy.spring.data.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class PrimaryParrotInMultiParrotConfig {

    @Bean
    public Parrot parrot1() {
        return new Parrot("Koko");
    }

    @Primary
    @Bean
    public Parrot parrot2() {
        return new Parrot("Miki");
    }

    @Bean
    public Parrot parrot3() {
        return new Parrot("Riki");
    }


}
