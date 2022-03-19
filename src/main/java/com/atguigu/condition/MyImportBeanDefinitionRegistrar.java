package com.atguigu.condition;

import com.atguigu.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-16
 *
 * @author yanlp
 * @version 1.0
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @param importingClassMetadata 导入类的注解信息
     * @param registry               BeanDefinition注册类
     *                               我们可以通过BeanDefinitionRegistry.registerBeanDefinition  手动注册所有需要添加到容器中的bean
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean blue = registry.containsBeanDefinition("com.atguigu.bean.Blue");
        boolean red = registry.containsBeanDefinition("com.atguigu.bean.Red");
        if (blue && red) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            System.out.println("rainBow添加到容器中");
            registry.registerBeanDefinition("rainBow", beanDefinition);
        }

    }
}
