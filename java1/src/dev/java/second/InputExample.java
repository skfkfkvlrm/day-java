package dev.java.second;

import java.util.Scanner;

public class InputExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();

        System.out.print("실수를 입력하세요: ");
        double dNum = scanner.nextDouble();

        scanner.nextLine(); // 버퍼 비우기

        System.out.print("문자열을 입력하세요: ");
        String str = scanner.nextLine();

        System.out.println("입력된 정수: " + num);
        System.out.println("입력된 실수: " + dNum);
        System.out.println("입력된 문자열: " + str);
    }
}
