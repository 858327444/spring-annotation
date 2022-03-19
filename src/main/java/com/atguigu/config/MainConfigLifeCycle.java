package com.atguigu.config;

import com.atguigu.bean.Car;
import com.atguigu.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-16
 *
 *
 * @author yanlp
 * @version 1.0
 */
@ComponentScan(basePackages = "com.atguigu")
@Configuration
public class MainConfigLifeCycle {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }


    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Dog dog(){
        return new Dog();
    }


}

