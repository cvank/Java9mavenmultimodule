package com.tbc.java9.mavenmultimodule.repository;

import com.tbc.java9.mavenmultimodule.domain.Author;

import java.util.List;

public class AuthorRepository {

    public static List<Author> getAllAuthors() {
        return List.of(new Author(1, "Collin"), new Author(2,"Rolling"));
    }
}
