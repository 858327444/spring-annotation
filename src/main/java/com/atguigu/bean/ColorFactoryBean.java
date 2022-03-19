package com.atguigu.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-16
 *
 * @author yanlp
 * @version 1.0
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject() throws Exception {
        System.out.println("获取到Color对象");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
