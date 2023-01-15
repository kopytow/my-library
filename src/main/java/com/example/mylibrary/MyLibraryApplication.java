package com.example.mylibrary;

import com.example.mylibrary.models.Book;
import com.example.mylibrary.models.BookStorage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyLibraryApplication {

	public static void main(String[] args) {
		BookStorage.getBooks().add(
				new Book("Инструментарий хакера", "Бабин С.")
		);
		BookStorage.getBooks().add(
				new Book("C++17 STL. Стандартная библиотека шаблонов  2018", "Галовиц Я.")
		);
		BookStorage.getBooks().add(
				new Book("Искусство программирования на С++", "Герберт Шилдт")
		);
		SpringApplication.run(MyLibraryApplication.class, args);
	}

}
