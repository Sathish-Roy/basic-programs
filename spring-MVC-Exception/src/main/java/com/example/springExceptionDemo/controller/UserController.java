package com.example.springExceptionDemo.controller;


import com.example.springExceptionDemo.exception.UserNotFoundException;
import com.example.springExceptionDemo.model.User;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<User> users = new ArrayList<>();
    private Long idCounter = 1L;

    @PostMapping
    public String createUser(@Valid @RequestBody User user) {
        user.setId(idCounter++);
        users.add(user);
        return "User added successfully with ID: " + user.getId();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException("User with ID " + id + " not found."));
    }

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }
}
