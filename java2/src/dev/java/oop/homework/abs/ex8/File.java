package dev.java.oop.homework.abs.ex8;

// 파일 클래스
public class File extends FileSystemComponent {
    public File(String name) {
        super(name);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "파일: " + name);
    }
}
