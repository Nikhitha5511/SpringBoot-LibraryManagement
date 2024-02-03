package com.LibrarySystem.LibrarySystemApplication.service;
import com.LibrarySystem.LibrarySystemApplication.Entity.Authority;

public interface AuthorityService {
    Authority saveAuthority(Authority authority);
    Authority findByName(String name);
}
