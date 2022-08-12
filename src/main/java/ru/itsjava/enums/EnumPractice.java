package ru.itsjava.enums;

import java.util.Arrays;

public class EnumPractice {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Weekday.values()));
        System.out.println("------------------");

        Weekday[] weekdays = Weekday.values();
        for (Weekday weekday : weekdays) {
            System.out.println(weekday);
            System.out.println(weekday.name());
            System.out.println(weekday.getTranslation());
            System.out.println(weekday.ordinal());
        }
        System.out.println("------------------");

        System.out.println("Weekday.MONDAY = " + Weekday.MONDAY);
        System.out.println("Weekday.valueOf(\"MONDAY\") = " + Weekday.valueOf("MONDAY"));
        System.out.println("------------------");

        Weekday day = Weekday.MONDAY;

        switch (day) {
            case SATURDAY:
                System.out.println("Отдыхаем!!!");
                break;
            case SUNDAY:
                System.out.println("Отдыхаем но готовимся к рабочим дням");
                break;
            default:
                System.out.println("Работать негры, солнце ещё высоко!!!!");
        }


    }


}
