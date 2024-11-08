package dev.java.oop.homework.open.ex6.sub2;

class FullTimeEmployee extends Employee {
    int hour = 8;
    void calculatePay() {
        System.out.println("하루 급여는: " + (hour * pay) + "입니다.");
    }
}

class PartTimeEmployee extends Employee {
    int hour = 4;
    void calculatePay() {
        System.out.println("하루 급여는: " + (hour * pay) + "입니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        fullTimeEmployee.calculatePay();
        partTimeEmployee.calculatePay();
    }
}
