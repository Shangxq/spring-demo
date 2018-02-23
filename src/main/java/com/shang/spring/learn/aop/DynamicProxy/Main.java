package com.shang.spring.learn.aop.DynamicProxy;

import com.shang.spring.learn.aop.cglib.RequesCallBack;
import com.shang.spring.learn.aop.cglib.RequestAble;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ISubject subject=(ISubject) Proxy.newProxyInstance(Main.class.getClassLoader(),new Class[]{ISubject.class},new RequestCtrlInvocationHandle(new SubjectImpl()));
        subject.request("shang");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RequestAble.class);
        enhancer.setCallback(new RequesCallBack());
        RequestAble requestAble = (RequestAble) enhancer.create();
        requestAble.request("shang");
    }
}
