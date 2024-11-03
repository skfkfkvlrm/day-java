package dev.java.oop.homework.abs.ex4;

//전사클래스
public class Warrior extends Charater {
    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "이(가) 검으로 공격합니다.");
    }
}
