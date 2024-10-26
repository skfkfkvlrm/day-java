package dev.java.second;

import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요: ");
        int firstNumber = scanner.nextInt();

        System.out.println("두 번째 숫자를 입력하세요: ");
        int secondNumber = scanner.nextInt();

        System.out.println("연산자를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        int result = performOperation( firstNumber, secondNumber, operator);

        System.out.println("결과: " +result);
    }

    private static int performOperation(int firstNumber, int secondNumber, char operator) {
        switch (operator) {
            case '+' :
                return add(firstNumber, secondNumber);
            case '-' :
                return subtract(firstNumber, secondNumber);
            case '*' :
                return multiply(firstNumber, secondNumber);
            case '/' :
                if (secondNumber == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                }
                return divide(firstNumber, secondNumber);
            default:
                System.out.println("올바른 연산자를 입력하세요.");
                return 0;
        }
    }
}
