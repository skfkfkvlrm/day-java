package dev.java.oop.homework.open.ex5.sub1;

//abstract?
public abstract class Animal {
    protected String name;
    protected int age;

    //생성자
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //공통메서드 추가 먹다, 자다 등..
    public void eat() {
        System.out.println("eating...");
    }

    public void sleep() {
        System.out.println("sleeping...");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // 고유 메서드
    public void bark() {
        System.out.println("Bark");
    }

    public void eat() {
        System.out.println("Dog chew");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    // 고유 메서드
    public void meow() {
        System.out.println("Meow");
    }

    public void eat() {
        System.out.println("Fish");
    }

    public void sleep() {
        System.out.println("meow");
    }
}

class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("나비", 2);
        System.out.println("이름은: " + cat.name + " " + "나이는: " + cat.age);
        cat.meow();
        cat.eat();
        cat.sleep();
        Dog dog = new Dog("댕이", 10);
        System.out.println("이름은: " + dog.name + " " + "나이는: " + dog.age);
        dog.bark();
        dog.eat();
        dog.sleep();
    }
}
