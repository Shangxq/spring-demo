package com.shang.spring.learn.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoMethodService {
    public void add(){
        System.out.println("我是method");
    }
}
