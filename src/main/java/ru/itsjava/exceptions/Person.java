package ru.itsjava.exceptions;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Person {
    private String name;
    private int age;


    public Person(String name, int age) throws AgeNotValidException {
        this.name = name;
        if ((this.age = age) <= 0) {
            throw new AgeNotValidException("Возраст меньше или равен 0: " + age);
        } else if ((this.age = age) >= 150) {
            throw new AgeNotValidException("Возраст больше или равен 150: " + age);
        }
        this.age = age;
    }
}
