package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListBook {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<Book> bookList_20 = new ArrayList<>(20);

        Book business = new Book("7 навыков высокоэффективных людей", "Кови", 387);
        Book java1 = new Book("Java. Эффективное программирование", "Блох Дж.", 219);
        Book java2 = new Book("Java. Руководство для начинающих", "Герберт Шилдт", 170);
        Book java3 = new Book("Java для чайников", "Барри Бёрд", 230);
        Book java4 = new Book("Философия Java", "Брюс Эккель", 160);
        Book fantasy1 = new Book("Ведьмак", "Сапковский Анджей", 672);
        Book fantasy2 = new Book("Хоббит, или Туда и Обратно", "Толкин", 208);
        Book poetry1 = new Book("Иосиф Бродский в Риме", "Бродский", 480);
        Book poetry2 = new Book("Сумерки свободы", "Мандельштам", 416);

//        1. Задачи на вставку элемента:
//        а) Добавить подряд 5 элементов.
//        б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
//        в) Записать в новый список все элементы предыдущего списка.

        Collections.addAll(bookList, java1, java2, java3, java4, business);
        System.out.println(bookList);
        bookList.add(2, fantasy1);
        System.out.println(bookList);
        bookList_20.addAll(bookList);
        System.out.println("Второй список\n" + bookList_20);

//        2. Получить элемент по индексу:
//        а). Получить первый элемент (первую книгу в списке)
//        б). Получить последний элемент (последнюю книгу в списке)

        System.out.println("bookList.get(0) = " + bookList.get(0));
        System.out.println("bookList.get(bookList.size() - 1) = " + bookList.get(bookList.size() - 1));

//        3. Задачи на удаление элементов: (Используя методы)
//        а) Удалить элемент по значению (книге)
//        б) Удалить элемент по индексу

        bookList.remove(2);
        System.out.println(bookList);
        System.out.println("bookList.remove(java1) = " + bookList.remove(java1));

//        4. Проверить наличие элемента

        System.out.println("bookList.contains(poetry1) = " + bookList.contains(poetry1));
        System.out.println("bookList.contains(java4) = " + bookList.contains(java4));


//        5. Вывод списка

        for (Book elemBook : bookList) {
            System.out.println(elemBook);
        }

    }


}
