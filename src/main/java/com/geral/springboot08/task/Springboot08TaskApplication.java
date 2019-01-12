package com.geral.springboot08.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync //开启异步注解
@EnableScheduling
public class Springboot08TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot08TaskApplication.class, args);
	}

}

