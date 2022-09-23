package com.example.auladatabase.rdswithapirest.ApiRest;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/employees")
    public List<Employee> ListOfEmployeeAll() {
        return repository.findAll();
    }
    @GetMapping("/employees/{id}")
    public Employee consultById(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

    }
    @PostMapping("/employees")
    public Employee newEmployee(@RequestBody Employee newEmployee){
        return repository.save(newEmployee);
    }
    @PutMapping("/employees/{id}")
    Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    employee.setRole(newEmployee.getRole());
                    employee.setAddress(newEmployee.getAddress());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return repository.save(newEmployee);
                });
    }
    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
