package dev.java.oop.homework.open.ex1.sub1;

import java.util.Scanner;

public class Speaker {

    /**
     * 접근제어자.
     */
    private final int volume;
    public String brand;


    /**
     * 생성자.
     */
    public Speaker(int volume, String brand) {
        this.volume = volume;
        this.brand = brand;
    }

    /**
     * 인자값을 받을 수 있게.
     */
    public void volumeUp() {
        Scanner volUp = new Scanner(System.in);
        System.out.println("볼륨값을 입력해주세요: ");
        int up = volUp.nextInt();
        int sum;
        {
            sum = volume + up;
            if (sum <= 100) {
                System.out.println("현재 볼륨은: " + (sum));
            } else {
                System.out.println("잘못입력하셨습니다");
            }
        }
    }

    public void volumeDown() {
        Scanner volDawn = new Scanner(System.in);
        System.out.println("볼륨값을 입력해주세요: ");
        int dawn = volDawn.nextInt();
        int sum;
        {
            sum = volume - dawn;
            if (sum >= 0) {
                System.out.println("현재 볼륨은: " + (sum));
            } else {
                System.out.println("잘못입력하셨습니다");
            }

        }
    }
}

class Main {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(10,"samsung");
        System.out.println(speaker.brand + " " + "speaker");
        Scanner upDawn = new Scanner(System.in);
        System.out.print("볼륨의 증감을 입력해주세요: ");
        String upDn = upDawn.nextLine();
        if (upDn.equals("+")) {
            speaker.volumeUp();
        }
        else if (upDn.equals("-")) {
            speaker.volumeDown();
        }
        else {
            System.out.println("다시 입력해주세요");
        }
    }
}
