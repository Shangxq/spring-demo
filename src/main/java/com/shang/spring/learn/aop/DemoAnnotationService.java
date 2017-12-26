package com.shang.spring.learn.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {
    @Action(name="注解方式拦截add操作")
    public void add(){
        System.out.println("我是注解");
    }
}
