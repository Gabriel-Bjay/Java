package Beginner;

import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    public Employee(String name) {
        this.name = name;
        // this.age = age;
        // this.designation = designation;
        // this.salary = salary;
    }

    public void empAge(int empAge) {
        age = empAge;
    }

    public void empDesignation(String empDesignation) {
        designation = empDesignation;
    }

    public void empSalary(double empSalary) {
        salary = empSalary;
    }

    public void printEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
