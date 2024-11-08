package dev.java.oop.homework.abs.ex7;

public abstract class Course {
    public void takeCourse() {
        enroll();
        attendLectures();
        submitAssignments();
        takeExams();
        getCertificate();
    }

    // 공통 구현 메서드
    public void enroll() {
        System.out.println("과정에 등록했습니다.");
    }

    public void attendLectures() {
        System.out.println("강의를 듣습니다.");
    }

    public void submitAssignments() {
        System.out.println("과제를 제출합니다.");
    }

    // 추상 메서드
    public abstract void takeExams();

    // 공통 구현 메서드
    public void getCertificate() {
        System.out.println("수료증을 받습니다.");
    }
}
