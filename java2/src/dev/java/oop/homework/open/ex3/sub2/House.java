package dev.java.oop.homework.open.ex3.sub2;

public class House {
    public String name;
    public String spft;

    // todo 기본생성자 누락
    // 생성자 접근제어 추가. public
    public House(String name, String spft) {
        this.name = name;
        this.spft = spft;
    }

    //todo displayInfo
    public void display() {
        System.out.println(this.name + " " + this.spft);
    }
}

class Main {
    public static void main(String[] args) {
        House house = new House("무궁화빌라", "25평");
        house.display();
    }
}
