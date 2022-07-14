package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Book {
    private String nameBook;
    private String author;
    private int numberPages;

    @Override
    public String toString() {
        return "{" + "Название книги: " + nameBook + ", Автор: " + author + ", кол-во стр.: " + numberPages + "}\n";
    }
}
