package com.example.JDBC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
public class SpringConfigFile {
    @Bean
    public DriverManagerDataSource mydataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring_practices");
        dataSource.setUsername("root");
        dataSource.setPassword("bappi");

        return dataSource;
    }
    @Bean
    public JdbcTemplate myJdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(mydataSource());
        return jdbcTemplate;
    }
}
