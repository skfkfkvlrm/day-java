package dev.java.oop.homework.open.ex6.sub1;

abstract class Instrument {
    void play() {
        System.out.println("Playing");
    }
}

class Piano extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Piano");
    }
}

class Guitar extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Guitar");
    }
}

class Drum extends Instrument {
    @Override
    void play() {
        System.out.println("Playing the Drum");
    }
}

public class Main {
    public static void main(String[] args) {
        Piano piano = new Piano();
        Guitar guitar = new Guitar();
        Drum drum = new Drum();
        Instrument[] instruments = {piano, guitar, drum};
        for (int i = 0; i < 3; i++) {
            instruments[i].play();
        }
    }
}
