package com.atguigu.test;

import com.atguigu.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-19
 *
 * @author yanlp
 * @version 1.0
 */
public class IOCProfileTest {

    private AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);

    @Test
    public void test1() {

        String[] beanNamesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String beanName : beanNamesForType) {
            System.out.println(beanName);
        }

        applicationContext.close();

    }


}
