package app.controller;

import app.model.Employee;

import app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/employees")
@CrossOrigin("*")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    @GetMapping
    public List<Employee> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Employee add(@RequestBody Employee emp) {
        return repo.save(emp);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee emp) {
        Employee e = repo.findById(id).orElseThrow();
        e.setName(emp.getName());
        e.setEmail(emp.getEmail());
        e.setLeaveStatus(emp.getLeaveStatus());
        e.setSalary(emp.getSalary());
        return repo.save(e);
    }
}






