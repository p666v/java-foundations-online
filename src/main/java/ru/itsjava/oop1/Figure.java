package ru.itsjava.oop1;

abstract class Figure {

    public final static double PI = 3.1415926535;

    public void getArea() {
        System.out.println("Вычисление площади фигуры");
    }

    public void getPerimeter() {
        System.out.println("Вычисление периметра фигуры");
    }

    abstract void getVolume();
}
