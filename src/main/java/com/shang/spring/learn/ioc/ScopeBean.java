package com.shang.spring.learn.ioc;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;

public class ScopeBean {
    @Autowired
    LocalDate myDate;

    @Autowired
    TestFactoryBean testFactoryBean;
    public void say(){
        System.out.println("test scope  "+ this.toString()+ myDate.toString()+ testFactoryBean.getObjectType());
    }
}
