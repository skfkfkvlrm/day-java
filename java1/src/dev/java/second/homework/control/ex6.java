package dev.java.second.homework.control;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학점을 입력해주세요.: ");
        int grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println("A");
        }

        else if (grade >= 80) {
            System.out.println("B");
        }

        else if (grade >= 70) {
            System.out.println("C");
        }

        else {
            System.out.println("F");
        }
    }
}
