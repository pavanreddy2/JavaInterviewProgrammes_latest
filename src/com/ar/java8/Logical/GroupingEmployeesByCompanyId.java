package com.ar.java8.Logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingEmployeesByCompanyId {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("C1", "E1", "John", "Doe"),
                new Employee("C1", "E2", "Jane", "Smith"),
                new Employee("C2", "E3", "Alice", "Brown")
        );

        Map<String, List<Employee>> groupedByCompany  = employees.stream()
                .collect(Collectors.groupingBy(Employee::getCompanyID));

        groupedByCompany.forEach((companyId, empList) -> {
            System.out.println("Company: "+ companyId);
            empList.forEach(e -> System.out.println(e.firstName + "  "+ e.lastName));
        });
    }
}
