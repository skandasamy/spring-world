package com.github.skandasamy.spring.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IntegerAnnotationConfigTest {

    @Test
    public void testTen() {
        ApplicationContext context = new AnnotationConfigApplicationContext(IntegerConfig.class);
        Object bean = context.getBean("ten");
        Assertions.assertNotNull(bean);
        Integer ten = (Integer)bean;
        Assertions.assertNotNull(ten);
        Assertions.assertEquals(10,ten);
    }
}
