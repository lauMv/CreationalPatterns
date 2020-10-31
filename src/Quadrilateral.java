package com.ucbcba;

public abstract class Quadrilateral implements Figure{
    int width;
    int height;
    Quadrilateral(int width)
    {
        this.width=width;
        this.height=width;
    }

    Quadrilateral(int width, int height)
    {
        this.width=width;
        this.height=height;
    }

    public void dibujar()
    {
        for (int i=0;i<width;i++)
        {
            for (int j=0;j<height;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public void draw() {
        System.out.println("el perimetro es"+ perimeter());
        System.out.println("el area es"+ area());
        dibujar();
    }

    @Override
    public double perimeter() {
        return 2*width+2* height;
    }

    @Override
    public double area() {
        return height *width;
    }
 }
