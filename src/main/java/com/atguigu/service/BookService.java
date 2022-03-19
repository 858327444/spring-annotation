package com.atguigu.service;

import com.atguigu.dao.BookDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-16
 *
 * @author yanlp
 * @version 1.0
 */
@Service
public class BookService {

    // @Autowired
    @Resource
    private BookDao bookDao;


    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
