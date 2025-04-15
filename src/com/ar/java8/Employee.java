package com.ar.java8;

public class Employee {
   private int id;
    private String name;
    private double salary;
    private String department;
    private String location;

    public Employee(int id, String name, double salary, String department, String location) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
