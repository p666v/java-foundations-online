package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Person {
    private String name;
    private double age;
    private String sex;


    public String toString() {
        return "{" + "Имя: " + this.name + ", Возраст: " + this.age + ", Пол: " + this.sex + "}\n";
    }
}
