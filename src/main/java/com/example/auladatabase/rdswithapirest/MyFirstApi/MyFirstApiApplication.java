package com.example.auladatabase.rdswithapirest.MyFirstApi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MyFirstApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstApiApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner (PersonRepository repository){
		return args -> {
			repository.save(new Person("Bernardo", "Maria"));
			repository.save(new Person("Ramos", "Pantoja"));
		};
	};

}
