package dev.java.second;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {


    public static void main(String[] args) {
        int[] numbers = new int[5];

        System.out.println(numbers.length);
        System.out.println(numbers[0]);

        int[] scores = {90, 80, 50, 40, 30};
//        System.out.println(scores.length);
//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);
//        System.out.println(scores[4]);
//        System.out.println(scores[5]);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
