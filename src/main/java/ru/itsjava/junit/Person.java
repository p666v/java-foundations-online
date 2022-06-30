package ru.itsjava.junit;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person {

    private final String name;
    private int age;

    public void birthday() {
        int newAge = age + 1;
        this.age = newAge;
        System.out.println("Имя: " + name + ", возраст: " + age + " лет");
    }

    public boolean takeBeer() {
        return age >= 18;
    }


}
