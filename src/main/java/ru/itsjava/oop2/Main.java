package ru.itsjava.oop2;

public class Main {
    public static void main(String[] args) {

        Birds crow = new Crow();
        System.out.println(crow);
        crow.speak();

        Birds parrot = new Parrot();
        System.out.println(parrot);
        parrot.speak();

    }
}
