package com.hlf.books.controller;

import com.hlf.books.entity.Book;
import com.hlf.books.repository.BooksRepo;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BooksController {
    private final BooksRepo booksRepo;

    @GetMapping(path = "/books")
    List<Book> getAllBooks() {
        return booksRepo.findAll();
    }
}
