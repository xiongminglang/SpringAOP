package com.cglib.Impl;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 16-6-12.
 */
public class BookFacadeCglib implements MethodInterceptor {

    private Object target;


    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());

        //使用回调方法
        enhancer.setCallback(this);

        //创建代理对象
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method,
                            Object[] objects,
                            MethodProxy methodProxy) throws Throwable {

        System.out.println("事物开始了"+">>>>>>>>>>>>>>");

        /*
         使用代理类执行方法
         */
        methodProxy.invokeSuper(o,objects);

        System.out.println("事物结束了"+">>>>>>>>>>>>>>");

        return null;
    }
}
