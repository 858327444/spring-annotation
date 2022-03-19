package com.atguigu.bean;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-16
 *
 * @author yanlp
 * @version 1.0
 */
public class Car {

    public Car() {
        System.out.println("car.....constructor....");
    }

    public void init(){
        System.out.println("car.....init....");
    }

    public void destroy(){
        System.out.println("car.....destroy....");
    }

}
