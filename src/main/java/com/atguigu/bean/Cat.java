package com.atguigu.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-17
 *
 * @author yanlp
 * @version 1.0
 */
@Component
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("cat .... construct ....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("cat .... destroy ....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat .... afterPropertiesSet ....");
    }
}
