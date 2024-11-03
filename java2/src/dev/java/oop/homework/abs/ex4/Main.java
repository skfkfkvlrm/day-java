package dev.java.oop.homework.abs.ex4;

public class Main {
    public static void main(String[] args) {
        Charater warrior = new Warrior("아서");
        warrior.move();
        warrior.attack();

        Wizard wizard = new Wizard("메르린");
        wizard.move();
        wizard.attack();
        wizard.castSpell();
    }
}
