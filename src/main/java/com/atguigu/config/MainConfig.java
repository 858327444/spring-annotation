package com.atguigu.config;

import com.atguigu.bean.Person;
import com.atguigu.filter.MyTypeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-15
 *
 * @author yanlp
 * @version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.atguigu",
        includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class})},
        useDefaultFilters = false // 如果要使用 includeFilters, 必须 useDefaultFilters=false 才能生效
)
public class MainConfig {

    @Bean("person")
    public Person person() {
        return new Person("lisi", 34);
    }


}
