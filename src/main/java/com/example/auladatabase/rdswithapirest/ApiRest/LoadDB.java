package com.example.auladatabase.rdswithapirest.ApiRest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDB {

    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

    @Bean
    CommandLineRunner applicationRunner(EmployeeRepository employeeRepository) {
        return args -> {
            log.info("Log of event save user 1: " + employeeRepository.save(new Employee("Fulano", "Developer", "Rua 1")));
            log.info("Log of event save user 2: " + employeeRepository.save(new Employee("Beltrano", "Developer", "Rua 2")));
        };
    }

}
