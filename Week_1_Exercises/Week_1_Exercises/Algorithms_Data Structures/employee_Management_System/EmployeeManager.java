package employee_Management_System;

public class EmployeeManager {
	private Employee[] employeeArray;
    private int size;

    public EmployeeManager(int initialCapacity) {
        employeeArray = new Employee[initialCapacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        try {
            if (size >= employeeArray.length) {
                Employee[] newArray = new Employee[employeeArray.length * 2];
                System.arraycopy(employeeArray, 0, newArray, 0, employeeArray.length);
                employeeArray = newArray;
            }
            employeeArray[size] = employee;
            size++;
        } catch (Exception e) {
            System.out.println("Error adding employee: " + e.getMessage());
        }
    }

    public Employee searchEmployeeById(int employeeId) {
        try {
            for (int i = 0; i < size; i++) {
                if (employeeArray[i].getEmployeeId() == employeeId) {
                    return employeeArray[i];
                }
            }
            return null; 
        } catch (Exception e) {
            System.out.println("Error searching for employee: " + e.getMessage());
            return null;
        }
    }

    public void displayEmployees() {
        try {
            for (int i = 0; i < size; i++) {
                System.out.println(employeeArray[i]);
            }
        } catch (Exception e) {
            System.out.println("Error displaying employees: " + e.getMessage());
        }
    }

    public boolean deleteEmployeeById(int employeeId) {
        try {
            int indexToDelete = -1;
            for (int i = 0; i < size; i++) {
                if (employeeArray[i].getEmployeeId() == employeeId) {
                    indexToDelete = i;
                    break;
                }
            }
            if (indexToDelete == -1) {
                return false; 
            }
            for (int i = indexToDelete; i < size - 1; i++) {
                employeeArray[i] = employeeArray[i + 1];
            }
            employeeArray[size - 1] = null; 
            size--;
            return true; 
        } catch (Exception e) {
            System.out.println("Error deleting employee: " + e.getMessage());
            return false;
        }
    }
}
