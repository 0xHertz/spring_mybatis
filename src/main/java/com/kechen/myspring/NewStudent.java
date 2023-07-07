package com.kechen.myspring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Component(value="mystudent")
public class NewStudent {
    private String stuNum="1";
    private String stuName="kehcen";
    private String stuGender="nv";
    private int stuAge=19;
    private Date enterenceTime=null;

    public void sayName(){
        System.out.println("我的名字叫: " + this.stuName);
    }
}
