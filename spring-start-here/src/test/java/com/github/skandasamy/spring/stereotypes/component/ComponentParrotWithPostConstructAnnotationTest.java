package com.github.skandasamy.spring.stereotypes.component;

import com.github.skandasamy.spring.config.ComponentParrotConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentParrotWithPostConstructAnnotationTest {

    @Test
    public void testComponentParrotWithPostConstruct() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentParrotConfig.class);
        Object component = context.getBean(ComponentParrotWithPostConstructAnnotation.class);
        Assertions.assertNotNull(component);
        ComponentParrotWithPostConstructAnnotation componentParrot = (ComponentParrotWithPostConstructAnnotation) component;
        Assertions.assertNotNull(componentParrot);
        Assertions.assertEquals("Koko",componentParrot.getName());
    }

}
