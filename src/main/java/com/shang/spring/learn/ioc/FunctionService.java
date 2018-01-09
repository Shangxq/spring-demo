package com.shang.spring.learn.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public String sayHello(String word){
        return "hello "+ word;
    }
}
