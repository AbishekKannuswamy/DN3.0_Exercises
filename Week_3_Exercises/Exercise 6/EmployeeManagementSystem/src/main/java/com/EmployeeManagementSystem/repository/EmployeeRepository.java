package com.EmployeeManagementSystem.repository;

import com.EmployeeManagementSystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Page<Employee> findByDepartmentId(Long departmentId, Pageable pageable);

    Page<Employee> findByNameContaining(String name, Pageable pageable);

    @Query("SELECT e FROM Employee e WHERE e.name = :name")
    Page<Employee> findEmployeesByName(@Param("name") String name, Pageable pageable);

    @Query("SELECT e FROM Employee e WHERE e.email = :email")
    Employee findEmployeeByEmail(@Param("email") String email);
}
