package com.EmployeeManagementSystem.controller;

import com.EmployeeManagementSystem.model.Employee;
import com.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/department/{departmentId}")
    public Page<Employee> getEmployeesByDepartment(
            @PathVariable Long departmentId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "name,asc") String[] sort) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(sort[0]).ascending());
        if (sort.length > 1 && "desc".equalsIgnoreCase(sort[1])) {
            pageable = PageRequest.of(page, size, Sort.by(sort[0]).descending());
        }

        return employeeRepository.findByDepartmentId(departmentId, pageable);
    }

    @GetMapping("/search")
    public Page<Employee> searchEmployeesByName(
            @RequestParam String name,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "name,asc") String[] sort) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(sort[0]).ascending());
        if (sort.length > 1 && "desc".equalsIgnoreCase(sort[1])) {
            pageable = PageRequest.of(page, size, Sort.by(sort[0]).descending());
        }

        return employeeRepository.findByNameContaining(name, pageable);
    }

    @GetMapping("/email/{email}")
    public Employee getEmployeeByEmail(@PathVariable String email) {
        return employeeRepository.findEmployeeByEmail(email);
    }
}
