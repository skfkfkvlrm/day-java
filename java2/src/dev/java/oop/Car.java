package dev.java.oop;

public class Car {
    private String color;
    private String model;
    private String brand;
    private int year;
    
    Car (String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    Car(String color, String model){
        this.color = color;
        this.model = model;

    }

    public void drive() {
        System.out.println(brand + " " + model + "을(를) 운전합니다.");
    }

    void startEngine(){
        System.out.println("Engine started");
    }

    void stopEngine(){
        System.out.println("Engine stopped");
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
}
