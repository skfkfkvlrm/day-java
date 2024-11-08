package dev.java.oop.homework.open.ex8.sub1;

public class Smartphone implements Chargeable {
    private int amount;

    public void charge(int amount) {
        this.amount = amount;
        System.out.println("Charged " + amount + " hour");
    }
}
