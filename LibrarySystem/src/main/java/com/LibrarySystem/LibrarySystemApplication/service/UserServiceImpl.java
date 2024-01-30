//package com.LibrarySystem.LibrarySystemApplication.service;
//
//import com.LibrarySystem.LibrarySystemApplication.Entity.User;
//import com.LibrarySystem.LibrarySystemApplication.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserServiceImpl {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public User getUserById(Long id) {
//        Optional<User> optionalUser = userRepository.findById(id);
//        return optionalUser.orElse(null);
//    }
//
//    public User updateUser(Long id, User updatedUser) {
//        Optional<User> optionalExistingUser = userRepository.findById(id);
//
//        if (optionalExistingUser.isPresent()) {
//            User existingUser = optionalExistingUser.get();
//            existingUser.setUsername(updatedUser.getUsername());
//            existingUser.setPassword(updatedUser.getPassword());
//            existingUser.setRole(updatedUser.getRole());
//
//            return userRepository.save(existingUser);
//        } else {
//            return null;
//        }
//    }
//
//    public void deleteUser(Long id) {
//        userRepository.deleteById(id);
//    }
//}
package com.LibrarySystem.LibrarySystemApplication.service;

import com.LibrarySystem.LibrarySystemApplication.Entity.User;
import com.LibrarySystem.LibrarySystemApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    public User updateUser(Long id, User updatedUser) {
        Optional<User> optionalExistingUser = userRepository.findById(id);

        if (optionalExistingUser.isPresent()) {
            User existingUser = optionalExistingUser.get();
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setPassword(updatedUser.getPassword());
            existingUser.setRole(updatedUser.getRole());

            return userRepository.save(existingUser);
        } else {
            return null;
        }
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
