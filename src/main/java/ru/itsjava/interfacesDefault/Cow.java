package ru.itsjava.interfacesDefault;

public class Cow implements Talkable, Eatable {
    @Override
    public void talk() {
        System.out.println("Муууууу");
    }

    @Override
    public void eat() {
        System.out.println("Вкусная и сочная травка");
    }
}
