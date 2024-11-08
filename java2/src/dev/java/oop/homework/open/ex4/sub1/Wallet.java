package dev.java.oop.homework.open.ex4.sub1;

public class Wallet {
    private int balance = 10000;

    public void addMoney() {
        this.balance += 1000;
        System.out.println("현재 잔액: " + balance);
    }

    public void spendMoney() {
        this.balance -= 1000;
        System.out.println("현재 잔액: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}
