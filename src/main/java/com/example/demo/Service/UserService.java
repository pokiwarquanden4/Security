package com.example.demo.Service;

import com.example.demo.dto.Role;
import com.example.demo.dto.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String userName, String roleName);
    User getUser(String name);
    List<User> getAllUsers();
}
