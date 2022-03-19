package com.atguigu.config;

import com.atguigu.bean.*;
import com.atguigu.condition.MacCondition;
import com.atguigu.condition.MyImportBeanDefinitionRegistrar;
import com.atguigu.condition.MyImportSelector;
import com.atguigu.condition.WindowsCondition;
import org.springframework.context.annotation.*;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-15
 *
 * @author yanlp
 * @version 1.0
 */
@Configuration
@Import({Color.class, Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    // @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Lazy
    @Bean("person1")
    public Person person1() {
        System.out.println("向容器中添加person....");
        return new Person("zhangsan", 15);
    }


    // 当符合WindowsCondition里面条件时,将会注册该bean
    @Bean("bill")
    @Conditional({WindowsCondition.class})
    public Person person2() {
        System.out.println("向容器中添加bill....");
        return new Person("bill", 70);
    }

    // 当符合MacCondition里面条件时,将会注册该bean
    @Bean("linus")
    @Conditional({MacCondition.class})
    public Person person3() {
        System.out.println("向容器中添加linus....");
        return new Person("linus", 50);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }






}
