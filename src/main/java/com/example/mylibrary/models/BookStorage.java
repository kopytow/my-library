package com.example.mylibrary.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BookStorage {
    private static List<Book> bookList = new ArrayList<>();

    static {
        bookList.add(
                new Book(
                        UUID.randomUUID().toString(),
                        "Инструментарий хакера",
                        "Бабин С.",
                        "Программирование")
        );
        bookList.add(
                new Book(
                        UUID.randomUUID().toString(),
                        "Академия и Империя (Основание)",
                        "Айзек Азимов",
                        "Научная фантастика")
        );

        bookList.add(
                new Book(
                        UUID.randomUUID().toString(),
                        "Байки из грота. 50 историй из жизни древних людей",
                        "Станислав Дробышевский",
                        "Научно-популярная литература")
        );

    }

    public static List<Book> getBooks() {
        return bookList;
    }
}
