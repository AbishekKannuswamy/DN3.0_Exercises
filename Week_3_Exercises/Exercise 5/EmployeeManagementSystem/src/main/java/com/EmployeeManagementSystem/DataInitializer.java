package com.EmployeeManagementSystem;

import com.EmployeeManagementSystem.model.Employee;
import com.EmployeeManagementSystem.model.Department;
import com.EmployeeManagementSystem.repository.EmployeeRepository;
import com.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void run(String... args) throws Exception {
        Department hr = new Department();
        hr.setName("HR");
        departmentRepository.save(hr);

        Department it = new Department();
        it.setName("IT");
        departmentRepository.save(it);

        Employee emp1 = new Employee();
        emp1.setName("raj");
        emp1.setEmail("raj@example.com");
        emp1.setDepartment(hr);
        employeeRepository.save(emp1);

        Employee emp2 = new Employee();
        emp2.setName("abi");
        emp2.setEmail("abishek@example.com");
        emp2.setDepartment(it);
        employeeRepository.save(emp2);

    }
}
