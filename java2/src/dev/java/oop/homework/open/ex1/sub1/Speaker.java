package dev.java.oop.homework.open.ex1.sub1;

public class Speaker {
    int volume = 10;
    String brand;

    void volumeUp() {
        volume++;
        System.out.println("Volume " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("Volume " + volume);
    }
}
