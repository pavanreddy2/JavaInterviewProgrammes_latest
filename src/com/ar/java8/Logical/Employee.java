package com.ar.java8.Logical;

public class Employee {
    String companyID;
    String employeeID;
    String firstName;
    String lastName;

    // Constructor
    public Employee(String companyID, String employeeID, String firstName, String lastName) {
        this.companyID = companyID;
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "companyID='" + companyID + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
