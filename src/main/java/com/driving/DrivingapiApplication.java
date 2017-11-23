package com.driving;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.driving.dao")
public class DrivingapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrivingapiApplication.class, args);
	}
}
