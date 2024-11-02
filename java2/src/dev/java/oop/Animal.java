package dev.java.oop;

public class Animal {
    private String eyes;
    private String nose;
    private String mouth;

    void makeSound() {
        System.out.println("Some sound");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }
}



class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

class Bird extends Animal {

    //todo 생성을 받았을 때 부모의 필드는 어떻게 되나?
    public Bird() {
    }

    void fly() {
        System.out.println("Flying...");
    }
}

class Human extends Animal {
    void walk() {
        System.out.println("Walking...");
    }
}

