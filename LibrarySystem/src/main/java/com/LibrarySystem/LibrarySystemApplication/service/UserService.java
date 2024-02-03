package com.LibrarySystem.LibrarySystemApplication.service;
import com.LibrarySystem.LibrarySystemApplication.Entity.User;

public interface UserService {
    User saveUser(User user);
    User findByEmail(String email);


}
