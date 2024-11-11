package dev.java.oop.homework.open.ex4.sub1;

import java.util.Scanner;

public class Wallet {
    private final int balance;

    // todo 초기화 생성자
    public Wallet(int balance) {
        this.balance = balance;
    }

    public void wallet() {
        System.out.println(balance);
    }

    // todo 인자값 추가
    public void addMoney() {
        Scanner balUp = new Scanner(System.in);
        System.out.println("입금값을 입력해주세요: ");
        int up = balUp.nextInt();
        int sum;
        {
            sum = balance + up;
            System.out.println("현재 잔액은: " + (sum));
        }
    }

    // todo 인자값 추가
    public void spendMoney() {
        // todo 조건문 추가 - 발생 처리
        Scanner balDawn = new Scanner(System.in);
        System.out.println("출금값을 입력해주세요: ");
        int dawn = balDawn.nextInt();
        int sum;
        {
            sum = balance - dawn;
            if (sum >= 0) {
                System.out.println("현재 잔액은: " + (sum));
            } else {
                System.out.println("잘못입력하셨습니다");
            }
        }
    }
}

// todo main 추가.
class Main {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(10000);
        System.out.println("현재 잔액은: ");
        wallet.wallet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("현금을 입금할지 출금할지 입력하세요: ");
        String input = scanner.nextLine();
        if (input.equals("입금")) {
            wallet.addMoney();
        } else if (input.equals("출금")) {
            wallet.spendMoney();
        } else {
            System.out.println("다시 입력해주세요.");
        }
    }
}
