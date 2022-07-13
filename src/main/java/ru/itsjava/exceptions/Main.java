package ru.itsjava.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            Person man = new Person("Pavel", 152);
        } catch (AgeNotValidException e) {
            System.err.println(e);
        }
    }
}
