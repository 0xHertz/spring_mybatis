package com.kechen.proxy;


import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

// 啥类都可以代理
// 需要在pom中导入cglib，如果使用spring，就不用额外导入了
public class CGLibDynamicProxy implements MethodInterceptor {
    private Object obj;
    public CGLibDynamicProxy(Object obj) {
        this.obj = obj;
    }
    public Object getProxy(){
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(obj.getClass());
        // 设置回调接口对象
        enhancer.setCallback(this);
        Object proxy = enhancer.create();
        return proxy;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        begin();
        Object returnValue = method.invoke(obj,objects); //通过反射调用被代理类的方法
        commit();
        return returnValue;
    }
    public void begin(){
        System.out.println("----------begin");
    }
    public void commit(){
        System.out.println("----------commit");
    }
}
