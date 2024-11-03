package dev.java.oop.homework.abs.ex4;

//마법사 클래스
public class Wizard extends Charater implements Magic {
    public Wizard(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "이(가) 지팡이로 공격합니다.");
    }

    @Override
    public void castSpell() {
        System.out.println(name + "이(가) 마법을 시전합니다.");
    }
}
