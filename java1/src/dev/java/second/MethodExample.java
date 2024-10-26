package dev.java.second;

public class MethodExample {

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // 메시지 출력 메서드
    public void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        MethodExample example = new MethodExample();
        int result = example.add(5, 3); // result는 8이 됨
        example.printMessage("안녕하세요!");

        System.out.println("덧셈 결과: " + result);
    }
}
