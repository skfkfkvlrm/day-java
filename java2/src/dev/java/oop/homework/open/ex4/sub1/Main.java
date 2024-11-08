package dev.java.oop.homework.open.ex4.sub1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액을 더할지 뺄지 입력하세요.");
        String input = scanner.nextLine();
        if (input.equals("+")) {
            wallet.addMoney();
        }
        else if (input.equals("-")) {
            wallet.spendMoney();
        }
        else {
            System.out.println("다시 입력해주세요.");
        }
    }
}
