package com.example.mylibrary;

import com.example.mylibrary.models.Book;
import com.example.mylibrary.models.BookStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class MyLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyLibraryApplication.class, args);
	}

}
