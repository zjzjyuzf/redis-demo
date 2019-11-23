package com.ppg.redisdemo.service.impl;

import com.ppg.redisdemo.domain.User;
import com.ppg.redisdemo.repository.UserDao;
import com.ppg.redisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User findOne(String userId) {
        return userDao.findByUserId(userId);
    }
}
