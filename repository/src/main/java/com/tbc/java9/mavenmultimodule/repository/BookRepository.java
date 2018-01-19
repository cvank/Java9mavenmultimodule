package com.tbc.java9.mavenmultimodule.repository;

import com.tbc.java9.mavenmultimodule.domain.Book;

import java.util.List;

public class BookRepository {

    public static List<Book> getBooks() {
        return List.of(new Book(1, "Book1"), new Book(2,"Book2"));
    }
}
