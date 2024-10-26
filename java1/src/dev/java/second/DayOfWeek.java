package dev.java.second;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("변경할 요일을 정수로 입력해주세요.");

        int  day = scanner.nextInt();
//        scanner.next().charAt(); // *, +, -, +

        String dayName = "";

        switch (day) {
            case 1:
                dayName = "월요일";
                break;
            case 2:
                dayName = "화요일";
                break;
            case 3:
                dayName = "수요일";
                break;
            case 4:
                dayName = "목요일";
                break;
            case 5:
                dayName = "금요일";
                break;
            case 6:
                dayName = "토요일";
                break;
            case 7:
                dayName = "일요일";
                break;
            default:
                dayName = "잘못된 입력입니다.";
                break;
        }

        System.out.println(dayName);
    }
}
