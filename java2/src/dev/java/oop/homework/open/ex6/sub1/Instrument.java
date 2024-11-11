package dev.java.oop.homework.open.ex6.sub1;

public class Instrument {
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

class Main {
    public static void main(String[] args) {
//        Piano piano = new Piano();
//        Guitar guitar = new Guitar();
//        Drum drum = new Drum();
//        Instrument[] instruments = {piano, guitar, drum};

        Instrument[] instruments = new Instrument[3];
        instruments[0]= new Piano();
        instruments[1]= new Guitar();
        instruments[2]= new Drum();

        for (Instrument Instrument : instruments) {
            Instrument.play();
        }

//        for (int i = 0; i < 3; i++) {
//            instruments[i].play();
//        }
    }
}
