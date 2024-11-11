package dev.java.oop.homework.open.ex2.sub2;

public class Employee {

    // 접근제어자 추가.  public, private, protected
    String name;
    int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void print() {
        System.out.println("Name: " + name + " " + "ID: " + employeeId);
    }

    // Main 추가.
}

class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("김수아", 1);
        Employee employee2 = new Employee("홍길동", 2);
        Employee employee3 = new Employee("김철수", 3);
        employee1.print();
        employee2.print();
        employee3.print();
    }
}
