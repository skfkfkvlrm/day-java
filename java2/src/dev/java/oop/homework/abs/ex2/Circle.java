package dev.java.oop.homework.abs.ex2;

// 구체적인 그래픽 요소 클래스
public class Circle extends Graphic {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("반지름이 " + radius + "인 원을 그립니다.");
    }
}
