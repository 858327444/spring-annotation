package com.atguigu.test;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import com.atguigu.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-16
 *
 * @author yanlp
 * @version 1.0
 */
public class IOCTest {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
    }


    @Test
    public void test2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        // String[] definitionNames = context.getBeanDefinitionNames();
        // for (String definitionName : definitionNames) {
        //     System.out.println(definitionName);
        // }
        //
        System.out.println("容器创建完成....");
        Object person = context.getBean("person");
        Object person2 = context.getBean("person");
        //
        // System.out.println(person == person2);

    }

    @Test
    public void test3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String property = context.getEnvironment().getProperty("os.name");
        System.out.println(property);
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
        Map<String, Person> personMap = context.getBeansOfType(Person.class);
        System.out.println(personMap);

    }


    @Test
    public void test4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        printBeans(context);

        Object colorFactoryBean = context.getBean("colorFactoryBean");
        Object colorFactoryBean2 = context.getBean("colorFactoryBean");
        System.out.println("是否一致: "+colorFactoryBean.equals(colorFactoryBean2));
        System.out.println("获取到的类型: "+colorFactoryBean.getClass());
    }

    private AnnotationConfigApplicationContext printBeans(AnnotationConfigApplicationContext context) {
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }
        return context;
    }
}
