package com.bookstoredemo.bookstore.models;

public class Book {
    private String title;
    private String author;
    private Integer price;
    private Integer pages;

    public Book() {
        this.author = "J.R.R. Tolkien";
        this.title = "Lord of the Rings";
        this.pages = 400;
        this.price = 300;
    }

    public Book(String title, String author) {
        // this(); nastavi stranky a cenu
        this();
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, Integer price, Integer pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
