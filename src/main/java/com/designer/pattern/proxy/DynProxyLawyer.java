package com.designer.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class DynProxyLawyer implements InvocationHandler {

    //被代理对象
    private Object target;

    public DynProxyLawyer(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("案件进展" + method.getName());
        Object result = method.invoke(target, args);
        return result;
    }
}
