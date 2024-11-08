package dev.java.oop.homework.abs.ex8;

// 디렉토리 클래스
import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "디렉토리: " + name);
        for (FileSystemComponent component : components) {
            component.display(indent + "    ");
        }
    }
}
