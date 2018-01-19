package com.tbc.java9.mavenmultimodule.api;

import com.tbc.java9.mavenmultimodule.service.author.AuthorService;
import com.tbc.java9.mavenmultimodule.service.book.BookService;

import java.util.logging.Logger;

public class BookController {


    private static final Logger LOG = Logger.getLogger(BookController.class.getName());
    public void displayAllBooks() {
        LOG.info("Displaying all books");

        BookService bookService = new BookService();
        bookService.getAllBooks().forEach(book -> System.out.println("Book Name: "+book.getName()));
    }

    public void displayAllAuthors() {

        LOG.info("Displaying all Authors ");
        AuthorService bookService = new AuthorService();
        bookService.getAllAuthors().forEach(author -> System.out.println("Author Name: "+author.getName()));
    }

    public static void main(String[] args) {
        BookController booksController = new BookController();

        booksController.displayAllBooks();
        booksController.displayAllAuthors();
    }

}
