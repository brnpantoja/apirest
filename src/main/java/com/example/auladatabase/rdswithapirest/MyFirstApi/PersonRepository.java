package com.example.auladatabase.rdswithapirest.MyFirstApi;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
