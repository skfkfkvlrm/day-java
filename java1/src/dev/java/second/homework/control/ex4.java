package dev.java.second.homework.control;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("정수를 입력하세요.");

        number = scanner.nextInt();
        sum += number;

        while (sum != 0) {
            System.out.println("합: " + sum);
            System.out.print("다음 정수: ");
            number = scanner.nextInt();
            sum += number;
        }

        System.out.println("합이 0이 되었습니다.");
        scanner.close();
    }
}
