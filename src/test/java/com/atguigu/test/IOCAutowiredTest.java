package com.atguigu.test;

import com.atguigu.bean.Red;
import com.atguigu.config.MainConfigOfAutowired;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-18
 *
 * @author yanlp
 * @version 1.0
 */
public class IOCAutowiredTest {
    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

    @Test
    public void test1() {
        // BookService bookService = applicationContext.getBean(BookService.class);
        // System.out.println(bookService);


        // String[] definitionNames = applicationContext.getBeanDefinitionNames();
        // for (String definitionName : definitionNames) {
        //     System.out.println(definitionName);
        // }


        Red bean = applicationContext.getBean(Red.class);



    }

}
