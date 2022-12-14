package com.dao;


import com.domain.User;

public interface IUserDao {


    User queryUserByName(String userName);
    void insert(User user);
}
