package com.kechen.myspring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentTest {

    @Test
    public void sayName() {
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("student-ioc.xml");
        //通过context获取对象
        Student student = context.getBean("mine", Student.class);
        //使用对象
        student.sayName();
    }
}