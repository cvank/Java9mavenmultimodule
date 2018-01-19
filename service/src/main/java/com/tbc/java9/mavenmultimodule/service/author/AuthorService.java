package com.tbc.java9.mavenmultimodule.service.author;

import com.tbc.java9.mavenmultimodule.domain.Author;
import com.tbc.java9.mavenmultimodule.repository.AuthorRepository;

import java.util.List;

public class AuthorService {

    public List<Author> getAllAuthors() {

        return AuthorRepository.getAllAuthors();
    }
}
