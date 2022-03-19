package com.atguigu.test;

import com.atguigu.config.MainConfigOfPropertyValues;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-16
 *
 * @author yanlp
 * @version 1.0
 */
public class IOCPropertyValuesTest {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);

    @Test
    public void test1() {
        printBeans(applicationContext);
        Object person = applicationContext.getBean("person");
        System.out.println(person);
    }

    private AnnotationConfigApplicationContext printBeans(AnnotationConfigApplicationContext context) {
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
        return context;
    }
}
