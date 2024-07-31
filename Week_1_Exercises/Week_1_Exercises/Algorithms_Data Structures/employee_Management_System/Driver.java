package employee_Management_System;

public class Driver {
	public static void main(String[] args) {
	 EmployeeManager manager = new EmployeeManager(2); 

     manager.addEmployee(new Employee(1, "Abishek", "Software Engineer", 745342.00));
     manager.addEmployee(new Employee(2, "Kannuswamy", "Senior Software Engineer", 100000.00));
     manager.addEmployee(new Employee(3, "Gopi", "Project Manager", 125000.00)); 

     System.out.println("Employees:");
     manager.displayEmployees();

     Employee searchedEmployee = manager.searchEmployeeById(2);
     System.out.println("\nSearched Employee");
     if (searchedEmployee != null) {
         System.out.println(searchedEmployee);
     } else {
         System.out.println("Employee not found");
     }

     boolean isDeleted = manager.deleteEmployeeById(2);
     System.out.println("\nDelete Status " + (isDeleted ? "Employee deleted successfully." : "Employee not found."));

     System.out.println("\nEmployees after deletion");
     manager.displayEmployees();
	}
}
