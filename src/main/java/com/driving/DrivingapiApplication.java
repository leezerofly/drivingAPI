package com.driving;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.driving.mapper")
public class DrivingapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrivingapiApplication.class, args);
	}
}
