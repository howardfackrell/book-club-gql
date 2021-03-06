package com.hlf.books.entity;

import lombok.Data;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "books", name = "book")
@Data
@Accessors(chain = true)
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "book_id")
  Long id;

  @Column(name = "title")
  String title;

  @Column(name = "isbn")
  String isbn;

  @Column(name = "page_count")
  Integer pageCount;
}
