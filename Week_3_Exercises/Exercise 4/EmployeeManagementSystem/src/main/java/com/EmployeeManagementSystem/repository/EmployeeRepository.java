package com.EmployeeManagementSystem.repository;
import com.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String Name);
    List<Employee> findByDepartmentId(Long departmentId);
}

