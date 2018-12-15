package com.jbm.sample.mysql;

import com.jbm.sample.mysql.entity.AggregateData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EntityScan(basePackageClasses = AggregateData.class)
@ComponentScan("com.jbm.sample")
public class MySqlAppStart {
    public static void main(String[] args) {
        SpringApplication.run(MySqlAppStart.class, args);
    }

}
