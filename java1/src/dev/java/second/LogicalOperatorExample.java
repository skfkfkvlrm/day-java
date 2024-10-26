package dev.java.second;

public class LogicalOperatorExample {

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y)); // false
        System.out.println("x || y : " + (x || y)); // ture
        System.out.println("x || y : " + (!x));     // false
    }

}