package com.ucbcba;

public class Circle implements Figure {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double perimeter() {
        return 2*((3.14)*radius);
    }

    @Override
    public double area() {
        return 3.14*(radius*radius);
    }

    @Override
    public void draw() {
        System.out.println("el perimetro es"+ perimeter());
        System.out.println("el area es"+ area());
    }
}

