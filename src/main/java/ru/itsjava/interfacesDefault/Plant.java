package ru.itsjava.interfacesDefault;

public class Plant implements Eatable {
    @Override
    public void eat() {
        System.out.println("Муха попалась в ловушку, сейчас её съем");
    }
}
