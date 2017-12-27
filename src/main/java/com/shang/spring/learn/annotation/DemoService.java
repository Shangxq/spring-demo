package com.shang.spring.learn.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public void outPut(){
        System.out.println("从组合注解获得");
    }
}
