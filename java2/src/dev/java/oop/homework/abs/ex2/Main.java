package dev.java.oop.homework.abs.ex2;

// 사용 예시
public class Main {
    public static void main(String[] args) {
        Graphic circle = new Circle(5);
        Graphic rectangle = new Rectangle(4, 6);

        circle.draw();
        circle.move(10, 20);

        rectangle.draw();
        rectangle.move(30, 40);
    }
}
