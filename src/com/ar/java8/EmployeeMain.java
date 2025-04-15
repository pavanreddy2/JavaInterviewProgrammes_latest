package com.ar.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "pavan", 100000, "IT", "Hyderabad"));
        employees.add(new Employee(2, "lavanya", 55000, "IT", "Bangalore"));
        employees.add(new Employee(3, "kanthu", 55000, "HR", "Delhi"));
        employees.add(new Employee(4, "jagadeesh", 20000, "Account", "Mumbai"));
        employees.add(new Employee(5, "karthik", 60000, "HR", "Hyderabad"));
        employees.add(new Employee(6, "Sai", 1700000, "IT", "Bangalore"));
        //employees.add(new Employee(7, "Sai", 1700000, null, "Bangalore"));

       //List of employees, who are belongs to bangalore and salary is greater than 90K above?
      List<Employee> employeeLocationAndSalary = employees.stream()
               .filter(employee -> employee.getLocation().equals("Bangalore") && employee.getSalary() > 90000)
               .collect(Collectors.toList());

        System.out.println(employeeLocationAndSalary);
        System.out.println();
        //List of employees need even number and salary is greater than 50000?
        List<Employee> filteredEmployeesEvenNum =  employees.stream()
                .filter(employee -> employee.getId() % 2 == 0 && employee.getSalary() > 5000)
                .collect(Collectors.toList());
        System.out.println(filteredEmployeesEvenNum);

        System.out.println();
        // Convert the list into map above programme?
       Map<Integer, Employee> employeeMap = employees.stream()
                .collect(Collectors.toMap(Employee::getId, employee -> employee));
        System.out.println(employeeMap);

        // Find all employees belonging to HR department
        List<Employee> hrDepartment = employees.stream()
                                            .filter(employee -> employee.getDepartment().equals("HR"))
                                                .collect(Collectors.toList());
        System.out.println(hrDepartment);

        //List all employees along with the department (even if employee is not part of any department)

        System.out.println();

        for (Employee employee : employees) {
            String department = employee.getDepartment();
            if (department == null) {
                department = "No Department";
            }
            System.out.println("Employee Name: " + employee.getName() + ", Department: " + department);
        }
    }
}
