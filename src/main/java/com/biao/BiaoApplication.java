package com.biao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.biao.dao")
public class BiaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiaoApplication.class, args);
	}
}
