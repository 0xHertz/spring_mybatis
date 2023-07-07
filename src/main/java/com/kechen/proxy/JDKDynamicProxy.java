package com.kechen.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


// 只能代理实现了接口的类
public class JDKDynamicProxy  implements InvocationHandler {
    private Object object;
    public JDKDynamicProxy(Object obj){
        this.object = obj;
    }

    // 返回代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(
                // 类加载器
                object.getClass().getClassLoader(),
                // 获取代理对象实现的接口
                object.getClass().getInterfaces(),
                //
                this
        );
    }
    public void before(){
        System.out.println("before-----------");
    }
    public void after(){
        System.out.println("after-----------");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object res = method.invoke(object,args);
        after();
        return res;
    }
}
