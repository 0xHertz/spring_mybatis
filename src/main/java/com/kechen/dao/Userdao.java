package com.kechen.dao;

import com.kechen.myspring.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 0xHertz
 * @Date: 2022/10/28 0028 14:39
 * @Description: buzhidaop
 **/

public interface Userdao {
    List<User> selectUsers();
    User selectUserById(Integer id);
}
