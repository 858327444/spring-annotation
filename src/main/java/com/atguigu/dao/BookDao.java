package com.atguigu.dao;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-16
 *
 * @author yanlp
 * @version 1.0
 */
@Repository
@Data
public class BookDao {
    private String label = "1";

    @Override
    public String toString() {
        return "BookDao{" +
                "label='" + label + '\'' +
                '}';
    }
}
