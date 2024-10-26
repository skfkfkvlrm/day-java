package dev.java.second;

public class OverloadingExample {
    public int multiply(int a, int b) {
        return a * b;
    }

    // 두 실수 곱셈
    public double multiply(double a, double b) {
        return a * b;
    }

    // 세 정수 곱셈
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double multiply(double a, double b, double c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();

        int result1 = example.multiply(2, 3);
        double result2 = example.multiply(2.5, 3.5);
        int result3 = example.multiply(2, 3, 4);
        double result4 = example.multiply(2.1, 2.7, 4.5);

        System.out.println("두 정수 곱셈: " + result1);
        System.out.println("두 실수 곱셈: " + result2);
        System.out.println("세 정수 곱셈: " + result3);
        System.out.println("세 실수 곱셈: " + result4);
    }
}
