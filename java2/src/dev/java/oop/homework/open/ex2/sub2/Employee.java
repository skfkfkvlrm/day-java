package dev.java.oop.homework.open.ex2.sub2;

public class Employee {
    String name;
    int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void print() {
        System.out.println("Name: " + name + " " + "ID: " + employeeId);
    }
}
