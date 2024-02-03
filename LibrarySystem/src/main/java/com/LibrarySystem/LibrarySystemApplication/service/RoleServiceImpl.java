package com.LibrarySystem.LibrarySystemApplication.service;
import com.LibrarySystem.LibrarySystemApplication.Entity.Role;
import com.LibrarySystem.LibrarySystemApplication.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role saveRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role findByName(String name) {
        return roleRepository.findByName(name);
    }


}
