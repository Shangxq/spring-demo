package com.shang.spring.learn.prepost;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class JSR250WayService implements ResourceLoaderAware{
    @Autowired
    ResourceLoader resourceLoader;
    ResourceLoader resourceLoader2;
    @PostConstruct
    public void init(){
        System.out.println("我来啦");
    }
    public JSR250WayService(){
        super();
        System.out.println("你好啊");
    }
    public void say(){
        System.out.println("--------------"+resourceLoader);
        System.out.println("--------------"+resourceLoader2);
    }
    @PreDestroy
    public void destoryA(){
        System.out.println("bye");
    }

    @Override
    public void setResourceLoader(final ResourceLoader resourceLoader) {
        this.resourceLoader2 = resourceLoader;
    }
}
