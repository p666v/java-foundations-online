package ru.itsjava.arraylist;

public class MyArrayListPractice {
    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();
        System.out.println("list.size() = " + list.size());
        list.add("elem0");
        list.add("elem1");
        list.add("elem2");
        list.add("elem3");
        list.add("elem4");
        list.add("elem5");
        list.add("elem6");
        list.add("elem7");
        list.add("elem8");
        list.add("elem9");
        list.add("elem10");
        list.add("elem11");
        list.add(20);
        System.out.println("После добавления list.size() = " + list.size());
        System.out.println(list);
        System.out.println("list.isEmpty() = " + list.isEmpty());

        MyArrayList list2 = new MyArrayList();
        System.out.println("list2.isEmpty() = " + list2.isEmpty());

        System.out.println("list.contains(\"elem11\") = " + list.contains("elem11"));
        System.out.println("list.contains(10) = " + list.contains(10));

        list.clear();
        System.out.println(list);


    }
}
