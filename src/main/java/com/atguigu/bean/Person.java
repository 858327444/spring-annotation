package com.atguigu.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-15
 *
 * @author yanlp
 * @version 1.0
 */
@Data
public class Person {

    @Value("wangwu")
    private String name;

    @Value(value = "19")
    private Integer age;

    @Value(value = "${person.nickName}")
    private String nickName;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
