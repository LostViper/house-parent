package com.eric.house;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.eric.house.*"})
@MapperScan("com.eric.house.dao")
public class HouseParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(HouseParentApplication.class, args);
    }

}

