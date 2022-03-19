package com.atguigu.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * Program Name: spring-annotation
 * Created by yanlp on 2022-03-19
 *
 * @author yanlp
 * @version 1.0
 */
// @Profile({"test"})
@PropertySource("classpath:/dbconfig.properties")
@Configuration
public class MainConfigOfProfile implements EmbeddedValueResolverAware {

    @Value("${db.user}")
    private String user;

    private String driverClass;


    @Profile("test")
    @Bean("testDataSource")
    public DataSource testDataSource(@Value("${db.password}")String password ) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driverClass);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/user_db");
        return dataSource;
    }

    @Profile("dev")
    @Bean("devDataSource")
    public DataSource devDataSource(@Value("${db.password}")String password ) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driverClass);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/edu_db1");
        return dataSource;
    }


    @Profile("prod")
    @Bean("prodDataSource")
    public DataSource prodDataSource(@Value("${db.password}")String password ) throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser(user);
        dataSource.setPassword(password);
        dataSource.setDriverClass(driverClass);
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/cloudDB01");
        return dataSource;
    }


    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        String driverClass = resolver.resolveStringValue("${db.driverClass}");
        this.driverClass = driverClass;
    }
}
