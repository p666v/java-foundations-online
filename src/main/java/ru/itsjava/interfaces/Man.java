package ru.itsjava.interfaces;

public class Man implements Runnable{

    @Override
    public void run() {
        System.out.println("Бежать марафон");
    }

    @Override
    public String maxRunDistance() {
        return "40 км";
    }
}
