package com.kechen.dao;

import com.kechen.myspring.User;
import com.kechen.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 0xHertz
 * @Date: 2022/10/28 0028 17:15
 * @Description: 测试
 **/

//1.通过@RunWith 声明当前测试类位于Spring容器环境（被Spring容器管理）
@RunWith(SpringJUnit4ClassRunner.class)
//2.通过@ContextConfiguration 声明当前测试环境的Spring容器运行时加载的配置文件
@ContextConfiguration("classpath:SpringWithMybatis.xml")
public class UserdaoZJTest {
    //因为当前测试类是基于Spring容器运行的，当前测试类的对象是通过Spring容器创建的
//因此可以通过Spring容器实现属性的注入
    @Resource
    private UserService userServiceImpl2;
    @Resource
    private UserService userServiceImpl;
    @Test
    public void test(){
        List<User> users = userServiceImpl.selectUsers();
        System.out.println(users);
    }
}
