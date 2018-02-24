package com.shang.spring.learn.aop.aopwithioc;

import org.springframework.stereotype.Component;

@Component
public class TestBookCount {
    public void say(){
        System.out.println("I'm 假书");
    }
    public int getCount() {
        return 10000;
    }
}
