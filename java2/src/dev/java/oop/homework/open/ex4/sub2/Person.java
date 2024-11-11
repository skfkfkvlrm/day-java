package dev.java.oop.homework.open.ex4.sub2;

import java.util.Scanner;

public class Person {
    private int age;

    //기본 생성자

    public Person() {
        this.age = 0;
    }

    void setAge(int age) {
        if (age <= 150 && age >= 0) {
            this.age = age;
        } else {
            System.out.println("유효하지 않은 나이입니다. 0에서 150 사이로 설정하세요.");
        }
    }
    // 접근제어자
    public int getAge() {
        return Integer.parseInt(String.valueOf(age));
    }

    //main 추가
    public static void main(String[] args) {
        Person person = new Person();

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter age: ");
//        person.setAge(scanner.nextInt());

        person.setAge(100);
        System.out.println(person.getAge());
    }
}
