package dev.java.oop.homework.abs.ex1;

// 정규직 직원 클래스
public class FullTimeEmployee extends Employee {
    private final double annualSalary;

    public FullTimeEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateSalary() {
        return annualSalary / 12; // 월급 계산
    }
}
