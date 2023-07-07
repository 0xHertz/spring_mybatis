package com.kechen.myspring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class NewStudentTest {

    @Test
    public void sayName() {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("student-with-ZJ.xml");
        //通过context获取对象
        NewStudent mystudent = context.getBean("mystudent",NewStudent.class);//第一个参数可以不写, 默认是首字母小写的类名
        mystudent.sayName();
    }
}