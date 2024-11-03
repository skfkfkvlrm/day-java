package dev.java.oop.homework.abs.ex1;

// 추상 클래스
public abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // 추상 메서드
    public abstract double calculateSalary();

    // 일반 메서드
    public void displayInfo() {
        System.out.println("이름: " + name);
        System.out.println("ID: " + id);
    }
}
