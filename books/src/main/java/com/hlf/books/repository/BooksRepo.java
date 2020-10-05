package com.hlf.books.repository;

import com.hlf.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepo extends JpaRepository<Book, Long> {
}
