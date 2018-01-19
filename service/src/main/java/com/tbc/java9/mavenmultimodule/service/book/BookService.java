package com.tbc.java9.mavenmultimodule.service.book;

import com.tbc.java9.mavenmultimodule.domain.Book;
import com.tbc.java9.mavenmultimodule.repository.BookRepository;

import java.util.List;

public class BookService {

    public List<Book> getAllBooks() {

        return BookRepository.getBooks();
    }
}
