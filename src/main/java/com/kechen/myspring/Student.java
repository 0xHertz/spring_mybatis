package com.kechen.myspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Student {
    @Value(value="001")
    private String stuNum;
    @Value(value="yy")
    private String stuName;
    @Value(value="nv")
    private String stuGender;
    @Value(value="18")
    private int stuAge;
    private Date enterenceTime;

    public void sayName(){
        System.out.println("我的名字叫: " + this.stuName);
    }
}
