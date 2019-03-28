package com.webDemo.dao;

import com.webDemo.domain.User;

import java.util.ArrayList;
import java.util.List;

public interface UserDao {
    public List<User> findAll();
}
