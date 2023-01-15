package com.example.mylibrary.models;

import java.util.ArrayList;
import java.util.List;

public class BookStorage {
    private static List<Book> bookList = new ArrayList<>();

    public static List<Book> getBooks() {
        return bookList;
    }
}
