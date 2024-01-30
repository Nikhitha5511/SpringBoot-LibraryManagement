package com.LibrarySystem.LibrarySystemApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.LibrarySystem.LibrarySystemApplication.Entity.Book;
import com.LibrarySystem.LibrarySystemApplication.repository.BookRepository;
import java.util.List;
import java.util.Optional;
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public Book updateBook(Long id, Book updatedBook) {
        Optional<Book> optionalExistingBook = bookRepository.findById(id);

        if (optionalExistingBook.isPresent()) {
            Book existingBook = optionalExistingBook.get();

            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());

            return bookRepository.save(existingBook);

        }
        else
        {
            throw new IllegalArgumentException("Book not found with ID: " + id);
        }
    }

}
