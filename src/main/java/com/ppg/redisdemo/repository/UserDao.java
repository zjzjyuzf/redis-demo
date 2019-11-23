package com.ppg.redisdemo.repository;

import com.ppg.redisdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,String> {

    User findByUserId(String userId);

}
