package ru.itsjava.oop3;

public class Main {
    public static void main(String[] args) {
        Car bmw = new BMW("X5", 240, "передний");
        Car bmw2 = new BMW("X5", 240, "передний");
        Car bmw3 = new BMW("X6", 240, "передний");

        Car mercedes = new Mercedes();
        Car mercedes2 = new Mercedes();
        mercedes2.setModel("E200");
        mercedes2.setPower(300);

        bmw.printDetails();
        bmw2.printDetails();
        bmw3.printDetails();

        mercedes.printDetails();
        mercedes2.printDetails();

        System.out.println(bmw.equals(bmw2));
        System.out.println(bmw.equals(bmw3));
        System.out.println(bmw.equals(mercedes));
        System.out.println(mercedes.equals(mercedes2));



    }
}
