package com.shang.spring.learn.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("thread")
public class FunctionService {
    public String sayHello(String word){
        return "hello "+ word;
    }
}
