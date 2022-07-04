package ru.itsjava.oop3;

public class BMW extends Car {
    private String drive;

    public BMW(String model, int power, String drive) {
        super("BMW", model, power, "Синий");
        this.drive = drive;

    }

    @Override
    public void printDetails() {
        System.out.println("Бренд: " + getBrand() + ", Модель: " + getModel() + ", Мощность: " +
                getPower() + " лс,  " + "\nПривод: " + drive + ", Цвет: " + getColor() + ", Цена: " + Car.price);
    }

}
