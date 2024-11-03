package dev.java.oop.homework.abs.ex4;

//추상 클래스
public abstract class Charater {
    protected String name;

    public Charater(String name) {
        this.name = name;
    }

    //추상 메서드
    public abstract void attack();

    //공통 메서드
    public void move() {
        System.out.println(name + "이(가) 이동합니다.");
    }
}
