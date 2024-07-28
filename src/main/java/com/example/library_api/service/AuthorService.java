package com.example.library_api.service;

import com.example.library_api.entity.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAll();
    Author findById(Long id);
    Author save(Author author);
    void delete(Long id);
}
