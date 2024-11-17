package com.example.myMovies;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyMoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMoviesApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {
		return  new ModelMapper();
	}

}
