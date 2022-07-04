package ru.itsjava.interfaces;

public class Bird implements Swimable, Runnable, Walkable, Flyable {
    @Override
    public void fly() {
        System.out.println("Не летаем, но всё же мы птицы");
    }

    @Override
    public void swim() {
        System.out.println("Плаваем мы преграсно");
    }

    @Override
    public void walk() {
        System.out.println("Ходим  вразвалку");
    }

    @Override
    public void run() {
        System.out.println("Бег не наша стезя");
    }
    @Override
    public String maxRunDistance(){
        return "Короткие дистанции";
    }
}
