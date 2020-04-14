package com.cx.service.impl;

import com.cx.dao.UserDao;
import com.cx.entity.User;
import com.cx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(User user) {
        user.setId("22");
//        user.setName("赵六");
        userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
