package com.LibrarySystem.LibrarySystemApplication.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.LibrarySystem.LibrarySystemApplication.Entity.Book;


public interface BookRepository extends  JpaRepository<Book, Long>{

}
