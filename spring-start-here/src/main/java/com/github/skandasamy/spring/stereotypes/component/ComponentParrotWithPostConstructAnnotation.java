package com.github.skandasamy.spring.stereotypes.component;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
public class ComponentParrotWithPostConstructAnnotation {
    private String name;

    @PostConstruct
    public void init() {
        this.name = "Koko";
    }
}
