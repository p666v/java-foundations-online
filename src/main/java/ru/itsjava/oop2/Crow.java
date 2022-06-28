package ru.itsjava.oop2;

public class Crow extends Birds {
    public Crow() {
        super("Килегрудые", "Corvus", "Серая ворона");
    }

    @Override
    public void speak() {
        System.out.println("Кар - Кар");
    }
}
