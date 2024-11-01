package dev.java.second.homework.array;

public class ex4 {
    public static void main(String[] args) {
        int scores[] = {35, 95, 70, 55, 10};
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += scores[i];
        }
        System.out.println(sum / 5);
    }
}
