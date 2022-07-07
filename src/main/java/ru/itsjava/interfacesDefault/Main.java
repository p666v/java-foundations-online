package ru.itsjava.interfacesDefault;

public class Main {
    public static void main(String[] args) {

        Man dima = new Man();
        dima.eat();
        dima.talk();

        Cow zorka = new Cow();
        zorka.eat();
        zorka.talk();

        Plant flycatcher = new Plant();
        flycatcher.eat();
    }
}
