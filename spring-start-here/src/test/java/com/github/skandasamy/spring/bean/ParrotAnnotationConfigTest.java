package com.github.skandasamy.spring.bean;

import com.github.skandasamy.spring.data.Parrot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ParrotAnnotationConfigTest {

    @Test
    public void parrotByMethodNameAnnotationConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ParrotConfig.class);
        Object bean = context.getBean("parrot"); //method name used to get the bean
        Assertions.assertNotNull(bean);
        Parrot parrot = (Parrot)bean;
        Assertions.assertNotNull(parrot.getName());
        Assertions.assertEquals("Koko", parrot.getName());
    }

    @Test
    public void parrotByReturnTypeNameAnnotationConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ParrotConfig.class);
        Object bean = context.getBean(Parrot.class); //Type Name used to get the bean
        Assertions.assertNotNull(bean);
        Parrot parrot = (Parrot)bean;
        Assertions.assertNotNull(parrot.getName());
        Assertions.assertEquals("Koko", parrot.getName());
    }
}
