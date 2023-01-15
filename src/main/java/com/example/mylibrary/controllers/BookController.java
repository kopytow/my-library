package com.example.mylibrary.controllers;

import com.example.mylibrary.models.BookStorage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
public class BookController {
    @RequestMapping("/books")
    public String books() {
        return BookStorage.getBooks().stream().
                map(book -> book.getTitle() + " - " +
                        book.getAuthor()).
                collect(Collectors.joining("<br>"));
    }
}
