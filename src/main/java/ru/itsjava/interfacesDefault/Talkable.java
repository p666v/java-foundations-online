package ru.itsjava.interfacesDefault;

public interface Talkable {
    default void talk(){
        System.out.println("Приветствие");
    }
}
