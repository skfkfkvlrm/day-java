package dev.java.oop.homework.open.ex3.sub1;

public class Computer {
    //todo 접근제어자
    public String brand;
    public String cpu;
    public String ram;

    public Computer(String brand, String cpu, String ram) {
        this.brand = brand;
        this.cpu = cpu;
        this.ram = ram;
    }

    //todo method 추가. public void displaySpecs();
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram);
    }
}
//todo Main 추가
class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("삼성", "I7-11700K","32GB");
        computer.display();
    }
}
