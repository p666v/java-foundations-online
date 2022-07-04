package ru.itsjava.oop1;

public class MainFigure {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(25, 12);
        tr1.getArea();
        Triangle tr2 = new Triangle(24, 19, 25);
        tr2.getPerimeter();

        Rectangle rectangle = new Rectangle(30, 35);
        rectangle.getArea();
        rectangle.getPerimeter();

        Square square = new Square(15);
        square.getArea();
        square.getPerimeter();

        Figure circle = new Circle(10);
        circle.getArea();
        circle.getPerimeter();

    }
}
