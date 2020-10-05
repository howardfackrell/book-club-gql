CREATE SCHEMA IF NOT EXISTS books;

CREATE TABLE books.book
(
   book_id    SERIAL,
   title      VARCHAR(200) NOT NULL,
   isbn       VARCHAR(100),
   page_count INTEGER
);