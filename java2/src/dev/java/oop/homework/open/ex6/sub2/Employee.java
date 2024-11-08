package dev.java.oop.homework.open.ex6.sub2;

public abstract class Employee {
    int hour;
    int pay = 8700;
    void calculatePay() {
        System.out.println("하루 급여는: " + (hour * pay) + "입니다.");
    }
}
