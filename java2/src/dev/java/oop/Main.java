package dev.java.oop;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("현대", "소나타", 2021);
        myCar.startEngine();
        myCar.stopEngine();
        myCar.getColor();
        myCar.getModel();
        myCar.drive();


        Student student = new Student("Jone", 1001);
        student.study();

        Bird bird = new Bird();
        Human human = new Human();
        bird.sleep();
        bird.fly();
        human.sleep();
        human.walk();

        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
