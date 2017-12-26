package com.shang.spring.learn.prepost;

import org.springframework.stereotype.Component;

public class BeanWayService {
    public void init(){
        System.out.println("Bean-init-method");
    }
    public BeanWayService(){
        super();
        System.out.println("构造函数");

    }
    public void destoryA(){
        System.out.println("销毁bean");
    }
}
