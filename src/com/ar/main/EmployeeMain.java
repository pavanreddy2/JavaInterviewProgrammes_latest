package com.ar.main;

import java.util.Arrays;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
       List<Employee> employeeList = Arrays.asList(new Employee(101L,"Nihil","Hyderabad",90000.00),
                new Employee(102L,"Sravani","Bangalore",100000.00),
                new Employee(103L,"Praveen","Bangalore",85000.00),
                new Employee(104L,"Niki","Chennai",800000.00));

        System.out.println(employeeList);
        System.out.println();
        //List of employees, who are belongs to bangalore and salary is greater than 90K above?
        for (Employee employee: employeeList) {
            if (employee.getCity().equalsIgnoreCase("Bangalore") && employee.getSalary() > 90000.00) {
                System.out.println(employee);
            }
        }

    }
}
