package com.cx.service;

import com.cx.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> findAll();
}
