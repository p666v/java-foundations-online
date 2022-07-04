package ru.itsjava.interfaces;

public class Cat implements Walkable{
    @Override
    public void walk() {
        System.out.println("Гулять по крышам");
    }
}
