package dev.java.oop.homework.abs.ex3;

public abstract class DataProcessor {
    //템플릿 메서드
    public final void process() {
        readData();
        processData();
        saveData();
    }

    public void readData() {
        System.out.println("데이터를 읽습니다.");
    }

    //하위 클래스에서 구현할 추상 메서드
    public abstract void processData();

    //공통 구현 메서드
    public void saveData() {
        System.out.println("데이터를 저장합니다.");
    }
}
