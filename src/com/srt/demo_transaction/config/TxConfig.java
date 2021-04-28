package com.srt.demo_transaction.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.srt.demo_transaction")
@EnableTransactionManagement
public class TxConfig {

    @Bean
    public DruidDataSource getDruidDataSourse(){

        DruidDataSource dataSources = new DruidDataSource();
        dataSources.setDriverClassName("com.mysql.jdbc.Driver");
        dataSources.setUrl("jdbc:mysql://localhost:3306/spring5");
        dataSources.setUsername("root");
        dataSources.setPassword("root");
        return dataSources;
    }
    
    
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSources){

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSources);

        return jdbcTemplate;
    }


    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSources){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSources);

        return dataSourceTransactionManager;
    }
}
