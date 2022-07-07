package ru.itsjava.interfacesDefault;

public interface Eatable {
    default void eat() {
        System.out.println("Вкусно покушать");
    }
}
