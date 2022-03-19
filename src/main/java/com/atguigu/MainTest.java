package com.atguigu;

import com.atguigu.bean.Person;
import com.atguigu.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-15
 *
 * @author yanlp
 * @version 1.0
 */
public class MainTest {

    public static void main(String[] args) {
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // Person person = (Person) context.getBean("person");

        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) context.getBean("person");

        System.out.println(person);
        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        for (String s : beanNamesForType) {
            System.out.println(s);
        }


    }
}
