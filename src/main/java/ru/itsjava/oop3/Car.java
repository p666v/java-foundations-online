package ru.itsjava.oop3;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode

public class Car {

    public static double price = 1_000_000;
    private final String brand;
    private String model;
    private int power;
    private String color;

//    public Car(String brand, String model, int power) {
//        this.brand = brand;
//        this.model = model;
//        this.power = power;
//    }

//    public String getBrand() {
//        return brand;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setPower(int power) {
//        this.power = power;
//    }
//
//    public int getPower() {
//        return power;
//    }

    public static void setPrice(double priceNew){
        price = priceNew;
    }

    public static double getPrice(){
        return price;
    }

    public void printDetails() {
        System.out.println("Бренд: " + brand + ", Модель: " + model + ", Мощность: " + power + " лс, " + "Цена: " + price);
    }


//    @Override
//    public boolean equals(Object o) { // прописываем в точности метод для переопределения
//        if (this == o) return true; // проверка ссылки на один и тот же объект, если это так то true
//        if (o == null || getClass() != o.getClass()) return false; // проверка, является ли объект экземпляром класса, если не является то false
//
//        Car car = (Car) o;  // приведение данных, явно указываем, что тут точно точно Car
//
//        if (power != car.power) return false; // проверяем на совпадение мощность, бренд, модель. Если не совпадает то возвращаем false
//        if (!brand.equals(car.brand)) return false;
//        return model.equals(car.model);
//    }
//
//    @Override
//    public int hashCode() {  // прописываем в точности метод для переопределения
//        return model.hashCode(); // берем hashCode model
//    }
}
