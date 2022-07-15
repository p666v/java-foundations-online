package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        Person dima = new Person("Dima", 28, "male");
        Person oleg = new Person("Oleg", 18, "male");
        Person ivan = new Person("Ivan", 22, "male");
        Person pavel = new Person("Pavel", 40, "male");
        Person ira = new Person("Ira", 28, "female");
        Person sveta = new Person("Sveta", 16, "female");
        Person olga = new Person("Olga", 25, "female");
        Person igor = new Person("Igor", 24, "male");

        List<Person> personList = new ArrayList<>(Arrays.asList(dima, oleg, ivan, pavel, ira, sveta, olga, igor));

//        10. Создать класс Person.( Поля: имя, возраст и пол isMale )
//        Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'

        System.out.println("Служить пойдёт:");
        char sourceChar = 'I';
        for (int i = 0; i < personList.size(); i++) {
            char firstChar = personList.get(i).getName().charAt(0);
            double age = personList.get(i).getAge();
            String sex = personList.get(i).getSex();
            if ("male".equals(sex) && age >= 18 && age <= 27 && (sourceChar == firstChar)) {
                System.out.println(personList.get(i));
            }
        }

//        11. Найти средний возраст всех женщин.
        System.out.print("Средний возраст всех женщин: ");
        int countWoman = 0;
        double ageSum = 0;
        for (int i = 0; i < personList.size(); i++) {
            String sex = personList.get(i).getSex();
            if ("female".equals(sex)) {
                ageSum += personList.get(i).getAge();
                countWoman++;
            }
        }
        double midleAge = ageSum / countWoman;
        System.out.println(midleAge);
    }
}
