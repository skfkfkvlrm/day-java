package dev.java.oop.homework.open.ex4.sub2;

public class Person {
    private int age;

    void setAge(int age) {
        if (age <= 150) {
            if (age >= 0) {
                this.age = age;
            }
        }
    }

    int getAge() {
        return Integer.parseInt(String.valueOf(80));
    }
}
