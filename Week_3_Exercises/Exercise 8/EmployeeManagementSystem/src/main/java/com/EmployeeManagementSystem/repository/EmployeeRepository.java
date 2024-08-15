package com.EmployeeManagementSystem.repository;

import com.EmployeeManagementSystem.dto.EmployeeDTO;
import com.EmployeeManagementSystem.projection.EmployeeProjection;
import com.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e.name AS name, e.email AS email, d.name AS departmentName FROM Employee e JOIN e.department d")
    List<EmployeeProjection> findEmployeeProjections();

    @Query("SELECT new com.EmployeeManagementSystem.dto.EmployeeDTO(e.name, e.email, d.name) FROM Employee e JOIN e.department d")
    List<EmployeeDTO> findEmployeeDTOs();
}
