package com.EmployeeManagementSystem.dto;

public class DepartmentDTO {
    private String name;
    private Long employeeCount;

    public DepartmentDTO(String name, Long employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(Long employeeCount) {
		this.employeeCount = employeeCount;
	}

}