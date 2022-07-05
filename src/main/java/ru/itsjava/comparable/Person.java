package ru.itsjava.comparable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class Person implements Comparable<Person>, Cloneable {
    private String name;
    private String lastName;
    private double age;


    public int compareTo(Person person) {
        int result = this.lastName.compareTo(person.lastName);
        if (result == 0) {
            result = this.name.compareTo(person.name);
        } else if (result == 0) {
            result = (int) (this.age - person.age);
        }
        return result;
    }

    @Override
    public String toString() {
        return "{" + "Имя " + name + ", Фамилия " + lastName + ", возраст " + age + "}\n";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
