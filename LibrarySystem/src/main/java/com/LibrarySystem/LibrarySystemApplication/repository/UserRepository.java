package com.LibrarySystem.LibrarySystemApplication.repository;
import com.LibrarySystem.LibrarySystemApplication.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long> {

    }
