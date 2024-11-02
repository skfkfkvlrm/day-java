package dev.java.oop.abs;

interface Drawable {
    public void draw();
}

interface Colorable {
    public void setColor(String color);
}

class Circle implements Drawable, Colorable {
    private String color;

    public void draw() {
        System.out.println("Drawing a " + color + " circle");
    }

    public void setColor(String color) {
        this.color = color;
    }
}