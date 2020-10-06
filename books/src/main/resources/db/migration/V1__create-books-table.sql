CREATE SCHEMA IF NOT EXISTS books;

CREATE TABLE books.book
(
   book_id    SERIAL,
   title      VARCHAR(200) NOT NULL,
   isbn       VARCHAR(100),
   page_count INTEGER
);

insert into books.book (title, isbn, page_count) values ('Tao of Pooh', '123', 98),
                                                    ('Way of Kings', '999', 1000),
                                                    ('Words of Radiance', '1000', 1200);
