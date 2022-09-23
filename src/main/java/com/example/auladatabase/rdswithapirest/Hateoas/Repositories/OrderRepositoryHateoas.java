package com.example.auladatabase.rdswithapirest.Hateoas.Repositories;

import com.example.auladatabase.rdswithapirest.Hateoas.Entitys.OrderHateoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryHateoas extends JpaRepository<OrderHateoas, Long> {
}
