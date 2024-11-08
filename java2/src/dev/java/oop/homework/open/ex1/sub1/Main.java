package dev.java.oop.homework.open.ex1.sub1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("동작(1 또는 2)을 입력해주세요: ");
        int run = scanner.nextInt();
        if(run == 1) {
            speaker.volumeUp();
        }
        else if(run == 2) {
            speaker.volumeDown();
        }
        else {
            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요. (1 또는 2)");
        }
    }
}
