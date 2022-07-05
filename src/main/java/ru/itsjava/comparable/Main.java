package ru.itsjava.comparable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Сергей", "Иванов", 37);
        Person person2 = new Person("Иван", "Петров", 26);
        Person person3 = new Person("Дмитрий", "Клюев", 32);
        Person person4 = new Person("Павел", "Коновалов", 40);
        Person person5 = new Person("Александр", "Малышев", 18);
        Person person6 = new Person("Виталий", "Кузнецов", 53);
        Person person7 = new Person("Андрей", "Сидоров", 19);

        System.out.println(person1.compareTo(person3));

        Person[] man = new Person[]{person1, person2, person3, person4, person5, person6, person7};

        System.out.println("До сортировки\n" + Arrays.toString(man));

        Arrays.sort(man);

        System.out.println("После сортировки\n" + Arrays.toString(man));

        Person pavel = new Person("Pavel", "Konovalov", 40);
        Person pavel2 = (Person) pavel.clone();

        System.out.println(pavel);
        System.out.println(pavel2);
    }
}
