package com.atguigu.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-17
 *
 * @author yanlp
 * @version 1.0
 */
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Dog() {
        System.out.println("Dog  constructor....");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Dog postConstruct....");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Dog preDestroy...");
    }

    public void init() {
        System.out.println("Dog init...");

    }

    public void destroy() {
        System.out.println("Dog destroy...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
