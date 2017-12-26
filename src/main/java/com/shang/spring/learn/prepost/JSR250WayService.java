package com.shang.spring.learn.prepost;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("我来啦");
    }
    public JSR250WayService(){
        super();
        System.out.println("你好啊");
    }
    @PreDestroy
    public void destoryA(){
        System.out.println("bye");
    }
}
