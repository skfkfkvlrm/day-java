package dev.java.oop.abs;

public abstract class Animal {
    abstract void eat();

    public void makeSound(){
        System.out.println("MakeSound");
    }
}



class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer eats grass");
    }
}
