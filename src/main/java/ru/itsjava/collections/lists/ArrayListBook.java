package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListBook {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        List<Book> bookList_20 = new ArrayList<>(20);

        Book business = new Book("7 навыков высокоэффективных людей", "Кови", 387);
        Book java1 = new Book("Java. Эффективное программирование", "Блох Дж", 219);
        Book java2 = new Book("Java. Руководство для начинающих", "Герберт Шилдт", 170);
        Book java3 = new Book("Java для чайников", "Барри Бёрд", 230);
        Book java4 = new Book("Философия Java", "Брюс Эккель.", 160);
        Book fantasy1 = new Book("Ведьмак", "Сапковский Анджей", 672);
        Book fantasy2 = new Book("Хоббит, или Туда и Обратно", "Толкин", 208);
        Book poetry1 = new Book("Иосиф Бродский в Риме", "Бродский", 480);
        Book poetry2 = new Book("Сумерки свободы", "Мандельштам", 416);
        Book java5 = new Book("Java", "Author1", 602);
        Book java6 = new Book("Java", "Author2", 703);
        Book java7 = new Book("Java", "Author3", 95);
        Book java8 = new Book("Java", "Author4", 64);

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

//        6. Отфильтровать список вернуть записи по некоторому условию:
//        а) Условие на индекс: Индекс делится на 3
//        б) Условие на значение: Вернуть количество книг, которые равны "Java"

        List<Book> myBookList = new ArrayList<>(Arrays.asList(business, java1, java2, java3, java4, java5, java6,
                poetry1, poetry2, fantasy1, fantasy2, java7, java8));

        System.out.println("Список книг в списке №3");
        for (Book elemMyBook : myBookList) {
            System.out.println(elemMyBook);
        }

        System.out.println("Индекс делится на 3");
        for (int i = 0; i < myBookList.size(); i++) {
            if ((i % 3) == 0) {
                System.out.println(myBookList.get(i));
            }
        }

        System.out.println("Вернуть количество книг, которые равны \"Java\"");
        int countNameJava = 0;
        for (int i = 0; i < myBookList.size(); i++) {
            if (myBookList.get(i).getNameBook().equals("Java")) {
                countNameJava++;
            }
        }
        System.out.println(countNameJava);

//        7. Пропустить несколько первых элементов
//        а) Пропустить первые 3 книги в списке.
//        б) Пропустить первые 2 книги, которые равные "Java"

        System.out.println("Пропустить первые 3 книги в списке");
        int countBook = 0;
        for (int i = 0; i < myBookList.size(); i++) {
            if (countBook < 3) {
                countBook++;
            } else {
                System.out.println(myBookList.get(i));
            }
        }

        System.out.println("Пропустить первые 2 книги, которые равные \"Java\"");
        countNameJava = 0;
        for (int i = 0; i < myBookList.size(); i++) {
            if (myBookList.get(i).getNameBook().equals("Java") && countNameJava < 2) {
                countNameJava++;
            } else {
                System.out.println(myBookList.get(i));
            }
        }

//        8. Вернуть первый подходящий элемент:
//        а) Возвращаем первую книгу, длина автора которого делится на 3.
        System.out.println("Возвращаем первую книгу, длина автора которого делится на 3");
        for (int i = 0; i < myBookList.size(); i++) {
            if (myBookList.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(myBookList.get(i));
                break;
            }
        }

//        9. Возвращаем все элементы удовлетворяющие условию:
//        а) Возвращаем все книги, длина автора которых делится на 3.
        System.out.println("Возвращаем все книги, длина автора которых делится на 3");
        for (int i = 0; i < myBookList.size(); i++) {
            if (myBookList.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(myBookList.get(i));
            }
        }


    }


}
