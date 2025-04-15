package com.ar.java8.logical2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
Given a List<Employee> where Employee has fields id, name, age, salary,
filter the list to include only
those employees with age greater than 36 and find the second-highest salary using Streams.
 */
public class AgeGreaterThanAndSecondSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 40, 50000),
                new Employee(2, "Jane", 38, 60000),
                new Employee(3, "Mark", 45, 70000),
                new Employee(4, "Lucy", 32, 40000)
        );

        Optional<Double> employeeSecond  = employees.stream()
                .filter(employee -> employee.getAge() > 36)
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }
}
