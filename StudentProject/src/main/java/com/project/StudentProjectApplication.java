package com.project;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentProjectApplication {

	@Bean
	public ModelMapper getModelmapper(){
		return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(StudentProjectApplication.class, args);
	}

}
