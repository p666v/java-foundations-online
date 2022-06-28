package ru.itsjava.oop2;

public class Parrot extends Birds{

    public Parrot() {
        super("Килегрудые", "Psittacidae", "Волнистый попугай");
    }

    @Override
    public void speak() {
        System.out.println("Попка дурак");
    }

}
