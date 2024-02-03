package com.LibrarySystem.LibrarySystemApplication.service;

import com.LibrarySystem.LibrarySystemApplication.Entity.Authority;
import com.LibrarySystem.LibrarySystemApplication.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public Authority saveAuthority(Authority authority) {
        return authorityRepository.save(authority);
    }

    @Override
    public Authority findByName(String name) {
        return authorityRepository.findByName(name);
    }

}
