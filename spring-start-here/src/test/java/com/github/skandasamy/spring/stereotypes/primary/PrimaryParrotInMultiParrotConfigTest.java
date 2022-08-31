package com.github.skandasamy.spring.stereotypes.primary;

import com.github.skandasamy.spring.stereotypes.primary.PrimaryParrotInMultiParrotConfig;
import com.github.skandasamy.spring.data.Parrot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryParrotInMultiParrotConfigTest {
    @Test
    public void defaultPrimaryParrot() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryParrotInMultiParrotConfig.class);
        Object bean = context.getBean(Parrot.class);
        Assertions.assertNotNull(bean);
        Parrot primaryParrot = (Parrot) bean;
        Assertions.assertEquals("Miki",primaryParrot.getName());
    }
}
