package com.kechen.proxy;

import com.kechen.service.UserService;
import com.kechen.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserServiceProxyTest {
    // 测试静态代理
    @Test
    public void test1(){
        UserService userService = new UserServiceImpl();
        StaticUserServiceProxy staticUserServiceProxy = new StaticUserServiceProxy(userService);

        staticUserServiceProxy.eat();
        staticUserServiceProxy.he();
        staticUserServiceProxy.shui();
        staticUserServiceProxy.la();
    }

    // 测试JDK动态代理
    // 只能代理实现了接口的类
    @Test
    public void test2(){
        // 代理UserService，其实还可以代理其他类，但是被代理的类需要是接口的实现类
        UserService userService = new UserServiceImpl();
        UserService proxy = (UserService) new JDKDynamicProxy(userService).getProxy();
        proxy.eat();
    }

    // 测试CGLib动态代理
    // 啥类都可以代理
    @Test
    public void test3(){
        UserService userService = new UserServiceImpl();
        UserService proxy = (UserService) new CGLibDynamicProxy(userService).getProxy();
        proxy.eat();
    }
}