package com.github.skandasamy.spring.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StringAnnotationConfigTest {

    @Test
    public void testHello() {
        ApplicationContext context = new AnnotationConfigApplicationContext(StringConfig.class);
        Object helloBean = context.getBean("hello");
        Assertions.assertNotNull(helloBean);
        String hello = (String)helloBean;
        Assertions.assertNotNull(hello);
        Assertions.assertEquals("Hello",hello);
    }
}
