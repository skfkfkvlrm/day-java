package dev.java.second.homework.word;

public class ex9 {
    public static void main(String[] args) {
        String data = "apple,banana,cherry";
        String apple = data.split(",")[0];
        String banana = data.split(",")[1];
        String cherry = data.split(",")[2];
        System.out.println(apple);
        System.out.println(banana);
        System.out.println(cherry);
    }
}
