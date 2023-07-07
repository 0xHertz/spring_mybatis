package com.kechen.myspring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class StrongStudent {
    @Before("execution(* com.kechen.myspring.Student.sayName())")
    public void beforesay(){
        System.out.println("你是谁呀");
    }

    @AfterReturning("execution(* com.kechen.myspring.Student.sayName())")
    public void aftersay(){
        System.out.println("我知道了");
    }

    @Around("execution(* com.kechen.myspring.Student.sayName())")
    public void aroundsay(ProceedingJoinPoint point) throws Throwable {
        System.out.println("=========");
        point.proceed();
        System.out.println("=========");
    }
}
