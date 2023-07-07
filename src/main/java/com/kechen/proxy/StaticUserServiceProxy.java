package com.kechen.proxy;

import com.kechen.service.UserService;

public class StaticUserServiceProxy {
    private UserService userService;

    public StaticUserServiceProxy(UserService userService){
        this.userService = userService;
    }

    public void eat() {
        before();
        userService.eat();
        after();
    }


    public void he() {
        before();
        userService.he();
        after();
    }


    public void shui() {
        before();
        userService.shui();
        after();
    }


    public void la() {
        before();
        userService.la();
        after();
    }

    public void before(){
        System.out.println("before-----------");
    }
    public void after(){
        System.out.println("after-----------");
    }
}
