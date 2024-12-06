package com.example.User.service;

import com.example.User.dto.User;
import com.example.User.feignClient.UserClient;
import com.example.User.response.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserClient userClient;

    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }

    public List<User> fetchAllUsers() {
        return userClient.getUsers();
    }

    public List<UserResponse> fetchSelectedUserDetails() {
        List<User> users = userClient.getUsers();
        return users.stream()
                .map(user -> new UserResponse(
                        user.getName(),
                        user.getUsername(),
                        user.getEmail(),
                        user.getAddress().getGeo().getLat(),
                        user.getAddress().getGeo().getLng()
                ))
                .collect(Collectors.toList());
    }

    public UserResponse fetchUserById(int id) {
        List<User> users = userClient.getUsers();
        return users.stream()
                .filter(user -> user.getId() == id)
                .map(user -> new UserResponse(
                        user.getName(),
                        user.getUsername(),
                        user.getEmail(),
                        user.getAddress().getGeo().getLat(),
                        user.getAddress().getGeo().getLng()
                ))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
    }
}
