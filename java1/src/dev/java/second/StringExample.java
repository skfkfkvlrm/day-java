package dev.java.second;

public class StringExample {
    public static void main(String[] args) {

        String str = "Java Programming";
        int len = str.length(); // 16
        char ch = str.charAt(5); // 'P'
        String sub = str.substring(0, 4); // "Java"
        boolean isEqual = str.equals("Java"); // false

        System.out.println("문자열 길이: " + len);
        System.out.println("5번째 문자: " + ch);
        System.out.println("부분 문자열: " + sub);
        System.out.println("문자열 비교 결과: " + isEqual);
    }
}
