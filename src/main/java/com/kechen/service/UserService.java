package com.kechen.service;

import com.kechen.myspring.User;

import java.util.List;

public interface UserService {
    public void eat();
    public void he();
    public void shui();
    public void la();
    List<User> selectUsers();
    User selectUserById(Integer id);
}
