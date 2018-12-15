package com.jbm.sample.mysql;

import com.jbm.sample.mysql.entity.AggregateData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.jbm.micro.boot.MicroBootApplication;

@MicroBootApplication
@EntityScan(basePackageClasses = AggregateData.class)
public class MySqlAppStart {
    public static void main(String[] args) {
        SpringApplication.run(MySqlAppStart.class, args);
    }

}
