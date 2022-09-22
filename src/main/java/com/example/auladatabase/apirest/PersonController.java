package com.example.auladatabase.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }
    @GetMapping("/")
    public String helloWorld() {
        return ("Hello World");
    }
    @GetMapping("/persons")
    public List<Person> consultAllPerson(){
        return repositoryPerson.findAll();
    }
    @GetMapping("/person/{id}")
    public Optional<Person> consultById(@PathVariable Long id){
        return repositoryPerson.findById(id);
    }
}
