package ru.itsjava.linkedlist;

import java.util.LinkedList;

public class MyLinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();

        list.add("Строка 1");
        System.out.println("list = " + list);

        list.add("Строка 2");
        System.out.println("list = " + list);

        list.add("Строка 3");
        System.out.println("list = " + list);

        System.out.println("list.size() = " + list.size());
        System.out.println("list.isEmpty() = " + list.isEmpty());
        System.out.println("list.contains(\"Строка 1\") = " + list.contains("Строка 1"));
        System.out.println("list.contains(\"Строка 2\") = " + list.contains("Строка 2"));
        System.out.println("list.contains(123) = " + list.contains(123));
        System.out.println("list2.contains(\"Строка 8\") = " + list2.contains("Строка 8"));
        list.clear();
        System.out.println("list2 = " + list2);
        System.out.println("list = " + list);

        list2.add("Строка 0");
        list2.add("Строка 1");
        list2.add("Строка 2");
        list2.add("Строка 3");
        System.out.println("list2 = " + list2);
        System.out.println("list2.get(0) = " + list2.get(0));
        System.out.println("list2.get(3) = " + list2.get(3));
        System.out.println("list2.get(2) = " + list2.get(2));

        System.out.println("list2.set(0, \"Строка 00\") = " + list2.set(0, "Строка 00"));
        System.out.println("list2.get(0) = " + list2.get(0));
        System.out.println("list2.set(3, \"Строка 33\") = " + list2.set(3, "Строка 33"));
        System.out.println("list2.get(3) = " + list2.get(3));
        System.out.println("list2.set(2, \"Строка 22\") = " + list2.set(2, "Строка 22"));
        System.out.println("list2.get(2) = " + list2.get(2));

        MyLinkedList list3 = new MyLinkedList();
        list3.add(111);
        list3.add(222);
        list3.add(222);
        list3.add(222);
        list3.add(444);
        System.out.println("list3.indexOf(222) = " + list3.indexOf(222));
        System.out.println("list3.lastIndexOf(222) = " + list3.lastIndexOf(222));
        System.out.println("list3.indexOf(555) = " + list3.indexOf(555));
        System.out.println("list3.lastIndexOf(555) = " + list3.lastIndexOf(555));

    }


}
