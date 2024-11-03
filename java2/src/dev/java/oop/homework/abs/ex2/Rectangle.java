package dev.java.oop.homework.abs.ex2;

public class Rectangle extends Graphic {
    private final int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("가로 " + width + ", 세로 " + height + "인 사각형을 그립니다.");
    }
}
