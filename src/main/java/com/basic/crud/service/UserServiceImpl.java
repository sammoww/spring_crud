package com.basic.crud.service;

import com.basic.crud.model.User;
import com.basic.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }
    @Override
    public User createIdentity(User entity) {
        return repository.save(entity);
    }

    @Override
    public User getUserById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public User updateUserById(Integer id, User entity) {
        if (repository.existsById(id)){
            entity.setId(id);
            return repository.save(entity);
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public void deleteUsers(Integer id){
        repository.deleteById(id);
    }
}
