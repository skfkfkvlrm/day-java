package dev.java.second.homework;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력해 주세요: ");
        int score = scanner.nextInt();
        if (score >= 60) {
            System.out.println("합격");
        }
        else {
            System.out.println("불합격");
        }
    }
}
