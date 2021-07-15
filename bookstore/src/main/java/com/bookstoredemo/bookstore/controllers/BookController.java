package com.bookstoredemo.bookstore.controllers;


import com.bookstoredemo.bookstore.models.Book;
import com.bookstoredemo.bookstore.repositories.BookShelf;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    private BookShelf bookShelf = new BookShelf();

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String getIndex(Model model){
        String tomsName = "Tom";
        model.addAttribute("name", tomsName);
        return "index";
    }

    @GetMapping("display-this-book")
    public String displayDefaultBook(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "display-book";
    }

    @GetMapping("list-books")
    public String displayAllBooks(Model model){
        model.addAttribute("books", bookShelf.getBooks());
        return "list-books";
    }

    @GetMapping("add-book")
    public String addNewBook(){
        return "add-book";
    }

    @PostMapping("add-book")
    public String addBook(@ModelAttribute Book book){
        bookShelf.addBook(book);
        return "redirect:/list-books";
    }

    @GetMapping("display-specific-book/{title}")
    public String displayOneBook(@PathVariable String title, Model model){
        model.addAttribute("book", bookShelf.findBookByTitle(title));
        return "display-book";
    }
}
