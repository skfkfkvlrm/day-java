package dev.java.oop.homework.abs.ex8;

public abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    // 추상 메서드
    public abstract void display(String indent);
}
