package com.example.exemplu5.service;


import com.example.exemplu5.model.Book;
import com.example.exemplu5.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public void addBook(Book book) {
    bookRepository.addBook(book);
  }

  public void addBooksForTitle(String title, int noOfBooks) {
    Optional<Book> book = bookRepository.findBookByTitle(title);
    if (book.isPresent()) {
      Book b = book.get();
      b.setNoBooks(b.getNoBooks() + noOfBooks);
    }
  }

  public List<Book> findBooksByAuthor(String author) {
    return bookRepository.findBooksByAuthor(author);
  }

  public void removeBooksForTitle(String title, int noOfBooks) {
    Optional<Book> book = bookRepository.findBookByTitle(title);
    if (book.isPresent()) {
      removeExistingBook(noOfBooks, book.get());
    }
  }

  public List<Book> findBooksByTitle(String keyword) {
    return bookRepository.findBooksByTitle(keyword);
  }

  private void removeExistingBook(int noOfBooks, Book book) {
    if (book.getNoBooks() > noOfBooks) {
      book.setNoBooks(book.getNoBooks() - noOfBooks);
    } else {
      if (book.getNoBooks() == noOfBooks) {
        bookRepository.removeBook(book);
      }
    }
  }

}
