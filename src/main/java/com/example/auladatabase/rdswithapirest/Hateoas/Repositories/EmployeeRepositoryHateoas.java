package com.example.auladatabase.rdswithapirest.Hateoas.Repositories;

import com.example.auladatabase.rdswithapirest.Hateoas.Entitys.EmployeeHateoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositoryHateoas extends JpaRepository<EmployeeHateoas, Long> {

}
