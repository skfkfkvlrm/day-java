package dev.java.oop;

class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    void study() {
        System.out.println(name + " is studying.");
    }
}
