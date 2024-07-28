package com.example.library_api.service;

import com.example.library_api.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    void delete(Long id);
}