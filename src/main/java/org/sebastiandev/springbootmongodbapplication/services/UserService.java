package org.sebastiandev.springbootmongodbapplication.services;

import org.sebastiandev.springbootmongodbapplication.domain.User;
import org.sebastiandev.springbootmongodbapplication.reposistory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
