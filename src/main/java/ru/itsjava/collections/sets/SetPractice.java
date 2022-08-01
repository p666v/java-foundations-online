package ru.itsjava.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
//        Man andrey  = new Man("Andrey");
//        Man maxim  = new Man("Maxim");
//        Man vitya  = new Man("Vitya");
//
//        Set<Man> manSet = new HashSet<>(Arrays.asList(andrey, maxim, vitya));
//        System.out.println("manSet = " + manSet);
//
//        System.out.println("manSet.add(andrey) = " + manSet.add(andrey));
//        System.out.println("manSet = " + manSet);
//
//        Man andrey2  = new Man("Andrey");
//
//        System.out.println("manSet.add(andrey2) = " + manSet.add(andrey2));
//        System.out.println("manSet.contains(andrey) = " + manSet.contains(andrey));
//
//        System.out.println("manSet.isEmpty() = " + manSet.isEmpty());
//        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));
//        System.out.println("manSet = " + manSet);
//
//        System.out.println("manSet.remove(andrey2) = " + manSet.remove(andrey2));
//        System.out.println("manSet = " + manSet);
//
//        System.out.println("manSet.size() = " + manSet.size());

        Fruit tangerines = new Fruit("Tangerines", 9.56);
        Fruit oranges = new Fruit("Oranges", 5.18);
        Fruit grapefruits = new Fruit("Grapefruits", 13.24);
        Fruit lemons = new Fruit("Lemons", 2.11);


        Set<Fruit> citrus = new HashSet<>(Arrays.asList(tangerines, oranges, grapefruits, lemons));
        System.out.println("citrus.size() = " + citrus.size());
        System.out.println("citrus = " + citrus);

        Fruit lime = new Fruit("Lime", 1.10);
        System.out.println("citrus.add(lime) = " + citrus.add(lime));
        System.out.println("citrus.size() = " + citrus.size());
        System.out.println("citrus = " + citrus);

        Fruit lime2 = new Fruit("Lime", 1.10);
        System.out.println("citrus.add(lime2) = " + citrus.add(lime2));
        System.out.println("citrus.size() = " + citrus.size());
        System.out.println("citrus = " + citrus);

        System.out.println("citrus.remove(tangerines) = " + citrus.remove(tangerines));
        System.out.println("citrus.contains(tangerines) = " + citrus.contains(tangerines));
        System.out.println("citrus.contains(oranges) = " + citrus.contains(oranges));
        System.out.println("citrus.size() = " + citrus.size());
        System.out.println("citrus = " + citrus);

    }
}
