package dev.java.oop.homework.open.ex7.sub2;

public abstract class Animal {
    void makeSound() {
        System.out.println("MakeSound");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("야옹");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("멍멍");
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
