package dev.java.oop.homework.open.ex6.sub2;

public class Employee {
    public int hour;
    public int pay;

    public Employee(int hour, int pay) {
        this.hour = hour;
        this.pay = pay;
    }

    void calculatePay() {
        System.out.println("하루 급여는: " + (hour * pay) + "입니다.");
    }

}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int hour, int pay) {
        super(hour, pay);
    }

    void calculatePay() {
        super.calculatePay();
    }
}

class PartTimeEmployee extends Employee {

    public PartTimeEmployee(int hour, int pay) {
        super(hour, pay);
    }

    void calculatePay() {
        super.calculatePay();
    }
}

class Main {
    public static void main(String[] args) {
        //FullTimeEmployee fullTimeEmployee = new FullTimeEmployee();
        //PartTimeEmployee partTimeEmployee = new PartTimeEmployee();
        //fullTimeEmployee.calculatePay();
        //partTimeEmployee.calculatePay();

        Employee fullTimeEmployee = new FullTimeEmployee(8, 10000);
        Employee partTimeEmployee = new PartTimeEmployee(4, 10000);

        fullTimeEmployee.calculatePay();
        partTimeEmployee.calculatePay();
    }
}
