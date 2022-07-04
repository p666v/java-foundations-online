package ru.itsjava.oop1;

public class Circle extends Figure {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void getArea() {
        System.out.println("Площадь круга через радиус " + (PI * radius * radius));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Периметр круга через радиус " + (2 * PI * radius));
    }
}
