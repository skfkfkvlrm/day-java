package dev.java.oop.homework.open.ex9.sub2;

public class Main {
    public static void main(String[] args) {
        String[] array = {"닭강정","떡볶이","감자탕"};

        try {
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외: 해당 정보가 존재하지 않습니다.");
        }
    }
}
