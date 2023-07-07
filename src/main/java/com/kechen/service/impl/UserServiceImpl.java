package com.kechen.service.impl;

import com.kechen.dao.Userdao;
import com.kechen.myspring.User;
import com.kechen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private Userdao userdao;
    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void he() {
        System.out.println("heing");

    }

    @Override
    public void shui() {
        System.out.println("shuiing");

    }

    @Override
    public void la() {
        System.out.println("laing");

    }

    @Override
    public List<User> selectUsers() {
        return userdao.selectUsers();
    }
    // Spring给方法添加事务管理, 一般不在Dao层直接开启事务，而是像这样在Service层中开启
    @Override
    @Transactional(isolation = Isolation.REPEATABLE_READ ,propagation = Propagation.SUPPORTS )
    public User selectUserById(Integer id) {
        return userdao.selectUserById(id);
    }
}
