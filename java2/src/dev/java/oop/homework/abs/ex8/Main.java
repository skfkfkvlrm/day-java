package dev.java.oop.homework.abs.ex8;

// 사용 예시
public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("루트");
        File file1 = new File("파일1.txt");
        File file2 = new File("파일2.txt");

        Directory subDir = new Directory("서브디렉토리");
        File file3 = new File("파일3.txt");

        root.addComponent(file1);
        root.addComponent(file2);
        root.addComponent(subDir);

        subDir.addComponent(file3);

        root.display(" ");
        /*
        출력:
        디렉토리: 루트
            파일: 파일1.txt
            파일: 파일2.txt
            디렉토리: 서브디렉토리
                파일: 파일3.txt
        */
    }
}
