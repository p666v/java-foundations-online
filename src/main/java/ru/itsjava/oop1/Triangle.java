package ru.itsjava.oop1;

public class Triangle extends Figure {
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double height) {
        this.sideA = sideA;
        this.height = height;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public void getArea() {
        System.out.println("Площадь треугольника по основанию и высоте= " + (sideA * height * 1 / 2));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр треугольника = " + (sideA + sideB + sideC));
    }

    @Override
    void getVolume() {

    }


}