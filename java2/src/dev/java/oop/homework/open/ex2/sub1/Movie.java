package dev.java.oop.homework.open.ex2.sub1;

public class Movie {
    public String title;
    public String director;
    public int releaseYear;


    /**
     * 생성자.
     */
    void printInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
    }

}

/**
 * 파일 한개로 정리.
 */
class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.title = "베테랑";
        movie.director = "류승완";
        movie.releaseYear = 2015;
        movie.printInfo();
    }
}
