package com.LibrarySystem.LibrarySystemApplication.repository;
import com.LibrarySystem.LibrarySystemApplication.Entity.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
    Authority findByName(String name);

}
