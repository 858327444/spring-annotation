package com.atguigu.config;

import com.atguigu.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-18
 *
 * @author yanlp
 * @version 1.0
 */
@Configuration
@ComponentScan(basePackages = {"com.atguigu.controller","com.atguigu.service","com.atguigu.dao","com.atguigu.bean"})
public class MainConfigOfAutowired {


    @Primary
    @Bean("bookDao2")
    public BookDao bookDao() {
        BookDao bookDao = new BookDao();
        bookDao.setLabel("2");
        return bookDao;
    }


}
