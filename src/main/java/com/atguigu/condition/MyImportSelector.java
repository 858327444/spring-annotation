package com.atguigu.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-16
 *
 * @author yanlp
 * @version 1.0
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{"com.atguigu.bean.Blue","com.atguigu.bean.Yellow"};
    }
}
