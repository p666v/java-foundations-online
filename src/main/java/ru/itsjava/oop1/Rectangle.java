package ru.itsjava.oop1;

public class Rectangle extends Square {
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public void getArea() {
        System.out.println("Площадь прямоугольника " + (getSideA() * sideB));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр прямоугольника = " + ((getSideA() + sideB) * 2));
    }
}