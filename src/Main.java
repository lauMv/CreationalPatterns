package com.ucbcba;

public class Main {

    int propiedad;

    public static void main(String[] args) {
        Figure circle = new Circle(4);
        Figure square = new Square(4);
        Figure rect = new Rectangle(3,6);
        draw(square);
        draw(circle);
        draw(rect);
    }

    public static void draw(Drawable drawable) {
        drawable.draw();
    }

}
