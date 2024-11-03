package dev.java.oop.homework.abs.ex3;

//사용 예시
public class Main {
    public static void main(String[] args) {
        DataProcessor csvprocessor = new CSVDataProcessor();
        csvprocessor.process();
        /*
        출력:
        데이터를 읽습니다.
        CSV 데이터를 처리합니다.
        데이터를 저장합니다.
         */

        DataProcessor xmlprocessor = new XMLDataProcessor();
        xmlprocessor.process();
        /*
        출력:
        데이터를 읽습니다.
        XML 데이터를 처리합니다.
        데이터를 저장합니다.
         */
    }
}
