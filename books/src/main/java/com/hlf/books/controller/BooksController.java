package com.hlf.books.controller;

import com.hlf.books.entity.Book;
import com.hlf.books.repository.BooksRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
@RequiredArgsConstructor
public class BooksController {
    private final BooksRepo booksRepo;

    @GetMapping(path = "/books")
    Collection<Book> getAllBooks() {
        return booksRepo.findAll();
    }
}
