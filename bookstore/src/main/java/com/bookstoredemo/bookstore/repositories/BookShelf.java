package com.bookstoredemo.bookstore.repositories;


import com.bookstoredemo.bookstore.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    List<Book> books;

    public BookShelf() {
        books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book("Dune", "Frank Herbert"));
        books.add(new Book("20000 miles under the sea", "Jules Verne", 200, 500));
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public Book findBookByTitle(String title) {
        return books
                    .stream()
                    .filter(book -> book.getTitle().equals(title))
                    .findFirst()
                    .orElse(null);
    }
}
