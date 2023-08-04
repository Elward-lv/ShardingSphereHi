package com.lvyanwei.shardingshperedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"META-INF.mybatis.mapper", "mapper", "com.xfvape.uid.worker.dao", "com.lvyanwei.shardingshperedemo.dao"})
public class ShardingShpereDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingShpereDemoApplication.class, args);
    }

}
