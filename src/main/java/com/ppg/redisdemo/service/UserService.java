package com.ppg.redisdemo.service;

import com.ppg.redisdemo.domain.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User findOne(String userId);

}
