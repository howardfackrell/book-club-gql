package com.hlf.books.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hlf.books.entity.Book;
import com.hlf.books.query.BooksInput;


import java.util.List;

public class BookResolver implements GraphQLQueryResolver {

    public List<Book> books(BooksInput booksInput) {
        return List.of(new Book().setTitle("Way of Kings"), new Book().setTitle("Words of Radiance"));
    }


}
