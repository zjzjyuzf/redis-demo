package com.ppg.redisdemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatasourceConf {

    @Bean(name = "druidDataSource")
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.1.114/quartz?characterEncoding=utf-8&useSSL=false");
        dataSource.setUsername("yuzf");
        dataSource.setPassword("Yuzf*333");
        dataSource.setMaxActive(50);

        return dataSource;
    }


}
