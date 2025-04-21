package com.ar.java8.logical3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeSortAndMap {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Alice", 50000, "HR"));
        list.add(new Employee("Bob", 60000, "IT"));
        list.add(new Employee("Charlie", 50000, "HR"));
        list.add(new Employee("David", 70000, "IT"));
        list.add(new Employee("Eve", 60000, "Finance"));

        //sort a list of objects in descending order of salary, and if salaries are equal, sort names in alphabetical order (ascending):
        list.sort(Comparator.comparingDouble(Employee::getSalary)
                .reversed().thenComparing(Employee::getName));
        list.forEach(System.out::println);

        // Group by department, then sort each list by salary desc and name asc

    Map<String, List<Employee>> groupedAndSorted =    list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                empList -> empList.stream()
                                        .sorted(Comparator
                                                .comparingDouble(Employee::getSalary).reversed()
                                                .thenComparing(Employee::getName))
                                        .collect(Collectors.toList())

                        )
                ));

        groupedAndSorted.forEach((dept, employees) -> {
            System.out.println("Department: " + dept);
            employees.forEach(System.out::println);
            System.out.println();
        });
    }
}
