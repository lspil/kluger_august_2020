package com.example.exemplu5.repositories;


import com.example.exemplu5.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {

  private List<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  public Optional<Book> findBookByTitle(String title) {
    for (Book b : books) {
      if (b.getTitle().equals(title)) {
        return Optional.of(b);
      }
    }
    return Optional.empty();
  }

  public void removeBook(Book b) {
    books.remove(b);
  }

  public List<Book> findBooksByAuthor(String author) {
    var result = new ArrayList<Book>();
    for (Book b : books) {
      if (b.getAuthor().equals(author)) {
        result.add(b);
      }
    }
    return result;
  }

  public List<Book> findBooksByTitle(String keyword) {
    List<Book> result = new ArrayList<>();
    for (Book b : books) {
      if (b.getTitle().contains(keyword)) {
        result.add(b);
      }
    }
    return result;
  }
}
