package dev.java.oop.homework.abs.ex7;

// 사용 예시
public class Main {
    public static void main(String[] args) {
        Course onlineCourse = new OnlineCourse();
        onlineCourse.takeCourse();
        /*
        출력:
        과정에 등록했습니다.
        강의를 듣습니다.
        과제를 제출합니다.
        온라인 시험을 봅니다.
        수료증을 받습니다.
        */

        Course offlineCourse = new OfflineCourse();
        offlineCourse.takeCourse();
        /*
        출력:
        과정에 등록했습니다.
        강의를 듣습니다.
        과제를 제출합니다.
        오프라인 시험을 봅니다.
        수료증을 받습니다.
        */
    }
}
