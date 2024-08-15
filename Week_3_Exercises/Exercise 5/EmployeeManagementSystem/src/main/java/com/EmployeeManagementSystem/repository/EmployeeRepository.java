package com.EmployeeManagementSystem.repository;

import com.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(name = "Employee.findByName")
    List<Employee> findByName(@Param("name") String name);

    @Query(name = "Employee.findByDepartmentId")
    List<Employee> findByDepartmentId(@Param("departmentId") Long departmentId);
}
