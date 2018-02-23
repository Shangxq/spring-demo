package com.shang.spring.learn.aop.DynamicProxy;

public class SubjectImpl implements ISubject {
    @Override
    public void request(final String name) {
        System.out.println(name+"good");
    }
}
