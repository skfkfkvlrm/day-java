package dev.java.oop.homework.abs.ex2;

// 추상 클래스
public abstract class Graphic {
    // 추상 메서드
    public abstract void draw();

    // 공통 메서드
    public void move(int x, int y) {
        System.out.println("좌표 (" + x + ", " + y + ")로 이동합니다.");
    }
}
