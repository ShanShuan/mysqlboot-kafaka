package com.wangzifeng.mysqlboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.wangzifeng.**"})
public class MysqlbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlbootApplication.class, args);
    }

}
