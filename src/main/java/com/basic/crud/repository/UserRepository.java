package com.basic.crud.repository;

import com.basic.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    //responsible for interacting with db
    //used for db operations because of the JpaRepository feature
    //no need to write sql operations
}
