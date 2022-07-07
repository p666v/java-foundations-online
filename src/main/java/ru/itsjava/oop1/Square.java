package ru.itsjava.oop1;

public class Square extends Figure {
    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public void getArea() {
        System.out.println("Площадь квадрата " + sideA * sideA);
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр квадрата = " + sideA * 4);
    }

    @Override
    void getVolume() {

    }

}
