package dev.java.oop.homework.open.ex9.sub1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = number1.nextInt();
        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num2 = number2.nextInt();
        try {
            int division = num1 / num2;
            System.out.println(division);
        }
        catch (ArithmeticException e) {
                System.out.println("Division by zero");
        }
        finally {
            number1.close();
        }

    }
}
