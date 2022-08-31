package com.github.skandasamy.spring.bean;

import com.github.skandasamy.spring.data.Parrot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MultiParrotAnnotationConfigTest {

    @Test
    public void accessMultiBeanDeclarationByTypeThrowsNoUniqueBeanDefinitionException() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MultiParrotConfig.class);
        NoUniqueBeanDefinitionException execption = Assertions.assertThrows(NoUniqueBeanDefinitionException.class,() -> { context.getBean(Parrot.class) ; } );
        Assertions.assertNotNull(execption);
        Assertions.assertNotNull(execption.getMessage());
        Assertions.assertTrue(execption.getMessage().contains("No qualifying bean of type 'com.github.skandasamy.spring.data.Parrot' available"));
    }

    @Test
    public void accessMultiBeanDeclarationByMethodName() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MultiParrotConfig.class);
        Parrot parrot1 = (Parrot)context.getBean("parrot1",Parrot.class);
        Assertions.assertNotNull(parrot1);
        Assertions.assertEquals("Koko",parrot1.getName());
        Parrot parrot2 = (Parrot)context.getBean("parrot2",Parrot.class);
        Assertions.assertNotNull(parrot2);
        Assertions.assertEquals("Miki",parrot2.getName());
        Parrot parrot3 = (Parrot)context.getBean("parrot3",Parrot.class);
        Assertions.assertNotNull(parrot3);
        Assertions.assertEquals("Riki",parrot3.getName());
    }

    @Test
    public void accessMultiBeanDeclarationByDefinedBeanName() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MultiParrotConfig.class);
        Parrot parrot1 = (Parrot)context.getBean("koko",Parrot.class);
        Assertions.assertNotNull(parrot1);
        Assertions.assertEquals("Koko",parrot1.getName());
        Parrot parrot2 = (Parrot)context.getBean("miki",Parrot.class);
        Assertions.assertNotNull(parrot2);
        Assertions.assertEquals("Miki",parrot2.getName());
        Parrot parrot3 = (Parrot)context.getBean("riki",Parrot.class);
        Assertions.assertNotNull(parrot3);
        Assertions.assertEquals("Riki",parrot3.getName());
    }
}
