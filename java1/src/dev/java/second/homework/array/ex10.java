package dev.java.second.homework.array;

import java.util.Arrays;
import java.util.List;

public class ex10 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 5};
        arr = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(arr));
    }
}
