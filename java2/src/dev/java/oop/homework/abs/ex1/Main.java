package dev.java.oop.homework.abs.ex1;

// 사용 예시
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("홍길동", 101, 60000000);
        Employee emp2 = new ContractEmployee("김영희", 102, 20000, 160);

        emp1.displayInfo();
        System.out.println("월급: " + emp1.calculateSalary() + "원\\n");

        emp2.displayInfo();
        System.out.println("급여: " + emp2.calculateSalary() + "원");
    }
}
