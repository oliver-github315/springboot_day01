package com.cx.dao;

import com.cx.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserDao {

    void save(User user);

    List<User> findAll();
}
