package com.example.exemplu5.controller;

import com.example.exemplu5.model.Book;
import com.example.exemplu5.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

  private final BookService bookService;

  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @PostMapping("/book")
  public void addBook(@RequestBody Book book) {
    bookService.addBook(book);
  }

  @GetMapping("/author/{author}")
  public List<Book> findBooksByAuthor(@PathVariable String author) {
    return bookService.findBooksByAuthor(author);
  }
}
