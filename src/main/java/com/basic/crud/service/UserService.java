package com.basic.crud.service;

import com.basic.crud.model.User;

import java.util.List;
//Service interacts with repository to perform operations

public interface UserService {
    User createIdentity(User entity);
    User getUserById(Integer id);
    User updateUserById(Integer id, User entity);
    List<User> getAllUsers();
    void deleteUsers(Integer id);

}
