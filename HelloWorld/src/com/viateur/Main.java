package com.viateur;
// Base class (Parent class)
class Person {
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}

// Subclass (Child class) inheriting from Person
class Employee extends Person {
    private int employeeId;

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter for employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee();

        // Using setter methods inherited from Person class
        employee.setName("John Doe");
        employee.setAge(30);

        // Using setter method from Employee class
        employee.setEmployeeId(12345);

        // Using getter methods to retrieve and display the information
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Age: " + employee.getAge());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
