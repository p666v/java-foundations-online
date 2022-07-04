package ru.itsjava.interfaces;

public class Dog implements Swimable, Runnable, Walkable {

    @Override
    public void run() {
        System.out.println("Бегать за машинами");
    }

    @Override
    public void swim() {
        System.out.println("Плавать с хозяином");
    }

    @Override
    public void walk() {
        System.out.println("Гулять в парке");
    }

    @Override
    public String maxRunDistance() {
        return "10 км.";
    }
}
