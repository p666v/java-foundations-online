package ru.itsjava.interfaces;

public class Fish implements Swimable{
    @Override
    public void swim() {
        System.out.println("Плыть на нерест");
    }
}
