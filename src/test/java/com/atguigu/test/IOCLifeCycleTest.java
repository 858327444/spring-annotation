package com.atguigu.test;

import com.atguigu.config.MainConfigLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-16
 *
 * @author yanlp
 * @version 1.0
 */
public class IOCLifeCycleTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
        // Object car = applicationContext.getBean("car");
        // System.out.println("获取到对象" + car);

        applicationContext.close();
    }

    // @Test
    // public void test2(){
    //
    // }

}
