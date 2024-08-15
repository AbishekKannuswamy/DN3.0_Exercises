package com.EmployeeManagementSystem.repository;

import com.EmployeeManagementSystem.dto.DepartmentDTO;
import com.EmployeeManagementSystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("SELECT new com.EmployeeManagementSystem.dto.DepartmentDTO(d.name, COUNT(e.id)) FROM Department d LEFT JOIN d.employees e GROUP BY d.name")
    List<DepartmentDTO> findDepartmentDTOs();
}
