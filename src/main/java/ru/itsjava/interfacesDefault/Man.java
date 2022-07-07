package ru.itsjava.interfacesDefault;

public class Man implements Talkable, Eatable {
    @Override
    public void talk() {
        System.out.println("Здравствуйте! Рад всех видеть!");
    }

    @Override
    public void eat() {
        System.out.println("Покушать печеньки");
    }
}
