package ru.itsjava.linkedlist;

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
    }
}
