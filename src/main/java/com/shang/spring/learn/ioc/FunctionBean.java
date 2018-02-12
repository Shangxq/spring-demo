package com.shang.spring.learn.ioc;

import org.springframework.beans.factory.annotation.Autowired;

public class FunctionBean {
    public String sayHello(String param){
        return "hello bean"+param;
    }
}
