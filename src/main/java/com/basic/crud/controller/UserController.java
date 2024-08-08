package com.basic.crud.controller;

import com.basic.crud.model.User;
import com.basic.crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //indicates that this class is a REST controller, meaning it will handle HTTP requests and return responses in JSON or XML format.
//also maps it to appropriate service methods
@RequestMapping("/api/entities")

public class UserController {
    private final UserService service; //serviceImpl is implememented.

    @Autowired
    public UserController(UserService userService){
        service = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
        //To extract values from the URI (path) of the request. It's used to capture values from the URL itself.
        return service.getUserById(id);
    }

    @PostMapping //@PostMapping used to create new resources on the server.
    public User createIdentity(@RequestBody User entity) { //or can return string as "User updated"
        //To bind the HTTP request body to a method parameter. It's used to extract data from the body of the request, often in JSON or XML format.
        return service.createIdentity(entity);

    }

    @PutMapping("/{id}") //@PutMapping used to update existing resources on the server.
    public User updateUserById(@PathVariable Integer id,@RequestBody User entity){
        return service.updateUserById(id, entity);
    }

    @DeleteMapping("/{id}")
    void deleteUsers(@PathVariable Integer id){
        service.deleteUsers(id);
    }

}
