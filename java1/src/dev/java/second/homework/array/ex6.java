package dev.java.second.homework.array;

import java.util.Arrays;

public class ex6 {
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 6, 2};
        int MAX = Arrays.stream(arr).max().getAsInt();
        System.out.println(MAX);
    }
}
