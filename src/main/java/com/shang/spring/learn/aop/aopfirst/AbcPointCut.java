package com.shang.spring.learn.aop.aopfirst;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

public class AbcPointCut extends StaticMethodMatcherPointcut {
    @Override
    public boolean matches(final Method method, final Class<?> targetClass) {
        return false;
    }
}
