package com.github.skandasamy.spring.stereotypes.component;

import com.github.skandasamy.spring.config.ComponentParrotConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ComponentParrotTest {

    @Test
    public void testComponentParrot() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentParrotConfig.class);
        Object component = context.getBean(ComponentParrot.class);
        Assertions.assertNotNull(component);
        ComponentParrot componentParrot = (ComponentParrot) component;
        Assertions.assertNotNull(componentParrot);
        Assertions.assertEquals(null,componentParrot.getName());
    }

}
