package com.LibrarySystem.LibrarySystemApplication.service;
import com.LibrarySystem.LibrarySystemApplication.Entity.Role;

public interface RoleService {
    Role saveRole(Role role);
    Role findByName(String name);
}
