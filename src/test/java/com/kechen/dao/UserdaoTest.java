package com.kechen.dao;

import com.kechen.myspring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class UserdaoTest {

    @Test
    public void selectUsers() {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringWithMybatis.xml");
        Userdao userdao = context.getBean(Userdao.class);
        List<User> users =  userdao.selectUsers();
        users.forEach(System.out::println);
    }

    @Test
    public void selectUserById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringWithMybatis.xml");
        Userdao userdao = context.getBean(Userdao.class);
        User user =  userdao.selectUserById(3);
        System.out.println(user.toString());
    }
}