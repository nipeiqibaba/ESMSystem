package com.neu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//启动类
@SpringBootApplication
@MapperScan("com.neu.mapper")
public class SpringBootApplicationDemo {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationDemo.class, args);
	}
}
