package com.cxytiandi.sharding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot版 Sharding JDBC 分库分表案例
 * 
 * @author yinjihuan
 *
 * @about http://cxytiandi.com/about
 */
@SpringBootApplication
@MapperScan(value = "com.cxytiandi.sharding.mapper")
public class ShardingDbTableApplication {
	public static void main(String[] args) {
		SpringApplication.run(ShardingDbTableApplication.class, args);
	}
}
