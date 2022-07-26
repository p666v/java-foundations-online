package ru.itsjava.junit.arraylist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.arraylist.MyArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    public static final int DEFAULT_SIZE = 0;
    public static final String DEFAULT_OBJECT = "TEST";
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;

    @DisplayName("Должен корректно создавать список через конструктор")
    @Test
    public void shouldHaveCorrectConstructor() {
        MyArrayList list = new MyArrayList();
        assertEquals(DEFAULT_SIZE, list.size());
    }

    @DisplayName("Должен корректно показывать размер списка")
    @Test
    public void shouldHaveShowSize() {
        MyArrayList list = new MyArrayList();
        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        assertAll("Размер",
                () -> assertEquals(DEFAULT_SIZE, list.size()),
                () -> assertEquals(1, list2.size()));
    }

    @DisplayName("Должен корректно показывать отображать статус списка (пустой/не пустой)")
    @Test
    public void shouldHaveShowIsEmpty() {
        MyArrayList list = new MyArrayList();
        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        assertAll("пустой/не пустой",
                () -> assertTrue(list.isEmpty()),
                () -> assertFalse(list2.isEmpty()));
    }

    @DisplayName("Должен корректно отображать статус наличия в списке объекта (существует/не существует)")
    @Test
    public void shouldHaveContains() {
        MyArrayList list = new MyArrayList();
        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        assertAll("Проверка содержимого",
                () -> assertFalse(list.contains(DEFAULT_OBJECT)),
                () -> assertTrue(list2.contains(DEFAULT_OBJECT)));
    }

    @DisplayName("Должен корректно добавлять объект в список")
    @Test
    public void shouldHaveAdd(){

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("TEST1");
        list2.add("TEST2");
        list2.add("TEST3");
        list2.add("WWW");
        assertAll("Добавление в список",
                ()-> assertTrue(list2.contains("WWW")),
                ()-> assertEquals(4,list2.indexOf("WWW")),
                ()-> assertEquals(5,list2.size()));
    }

    @DisplayName("Должен корректно удалять объект")
    @Test
    public void shouldHaveRemoveOfObject() {

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("TEST1");
        list2.add("TEST2");
        list2.add("TEST3");
        list2.remove("TEST2");
        assertAll("Проверка содержимого и размера",
                () -> assertFalse(list2.contains("TEST2")),
                () -> assertEquals(3, list2.size()));
    }

    @DisplayName("Должен корректно очищать список")
    @Test
    public void shouldHaveClear() {

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("TEST1");
        list2.add("TEST2");
        list2.add("TEST3");
        list2.clear();
        assertEquals(DEFAULT_SIZE, list2.size());
    }

    @DisplayName("Должен корректно возвращать объект по индексу")
    @Test
    public void shouldHaveGetIndex(){

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("TEST1");
        list2.add("TEST2");
        list2.add("TEST3");
        assertAll("Возврат по индексу",
                ()-> assertEquals(DEFAULT_OBJECT,list2.get(0)),
                ()-> assertEquals("TEST2",list2.get(2)));
    }

    @DisplayName("Должен корректно перезаписывать объект по индексу")
    @Test
    public void shouldHaveSetIndex(){

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("TEST1");
        list2.add("TEST2");
        list2.add("TEST3");
        list2.set(1,"ЗАМЕНА");
        assertAll("Проверка перезаписи",
                ()-> assertEquals(DEFAULT_OBJECT,list2.get(0)),
                ()-> assertEquals("ЗАМЕНА",list2.get(1)));
    }

    @DisplayName("Должен корректно добавлять объект в список по индексу")
    @Test
    public void shouldHaveAddIndex(){

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("TEST1");
        list2.add("TEST2");
        list2.add("TEST3");
        list2.add(2,"WWW");
        assertAll("Добавление в список по индексу",
                ()-> assertTrue(list2.contains("WWW")),
                ()-> assertEquals(2,list2.indexOf("WWW")),
                ()-> assertEquals(5,list2.size()));
    }

    @DisplayName("Должен корректно удалять объект по индексу")
    @Test
    public void shouldHaveRemoveOfIndex(){

        MyArrayList list2 = new MyArrayList();
        list2.add(DEFAULT_OBJECT);
        list2.add("TEST1");
        list2.add("TEST2");
        list2.add("TEST3");
        list2.remove(1);
        assertAll("Удаление по индексу",
                ()-> assertFalse(list2.contains("TEST1")),
                ()-> assertEquals("TEST2", list2.get(1)),
                ()-> assertEquals(3,list2.size()));
    }

//    @DisplayName("Должен проверять корректность ввода индекса")
//    @Test
//    public void shouldHaveIsCorrectIndex(){
//
//        MyArrayList list2 = new MyArrayList();
//        list2.add(DEFAULT_OBJECT);
//        list2.add("TEST1");
//        list2.add("TEST2");
//        list2.add("TEST3");
//        assertAll("Корректный индекс",
//                ()-> assertTrue(list2.add(1,"WWW")),
//                ()-> assertFalse(list2.add(10,"TTT")));
//    }

    @DisplayName("Должен корректно возвращать индекс первого вхождения объекта")
    @Test
    public void shouldHaveGetIndexOf(){

        MyArrayList list2 = new MyArrayList();
        list2.add("TEST1");
        list2.add("TEST3");
        list2.add("TEST3");
        list2.add("TEST3");
        list2.add("TEST4");
        assertAll("Первое вхождение объекта",
                ()-> assertEquals(1,list2.indexOf("TEST3")),
                ()-> assertEquals(-1,list2.indexOf("TEST5")));
    }

    @DisplayName("Должен корректно возвращать индекс последнего вхождения объекта")
    @Test
    public void shouldHaveGetLastIndexOf(){

        MyArrayList list2 = new MyArrayList();
        list2.add("TEST1");
        list2.add("TEST3");
        list2.add("TEST3");
        list2.add("TEST3");
        list2.add("TEST4");
        assertAll("Последнее вхождение объекта",
                ()-> assertEquals(3,list2.lastIndexOf("TEST3")),
                ()-> assertEquals(-1,list2.lastIndexOf("TEST5")));
    }

}
