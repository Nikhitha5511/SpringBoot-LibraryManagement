package com.LibrarySystem.LibrarySystemApplication.repository;
import com.LibrarySystem.LibrarySystemApplication.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
