package com.kechen.myspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author 0xHertz
 * @Date: 2022/10/28 0028 14:32
 * @Description: 用户信息
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private String password;
    private String sex;
    private Date brithday;
    private Date registTime;
}
