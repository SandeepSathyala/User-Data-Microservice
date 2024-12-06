package com.example.User.controller;

import com.example.User.dto.User;
import com.example.User.response.UserResponse;
import com.example.User.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.fetchAllUsers();
    }
    @GetMapping("/details")
    public List<UserResponse> getUserDetails() {
        return userService.fetchSelectedUserDetails();
    }

    @GetMapping("/details/{id}")
    public UserResponse getUsersById(@PathVariable int id) {
        return userService.fetchUserById(id);
    }
}