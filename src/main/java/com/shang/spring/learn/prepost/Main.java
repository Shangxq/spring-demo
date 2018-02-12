package com.shang.spring.learn.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        context.getBean(BeanWayService.class);
        context.getBean(JSR250WayService.class).say();
        context.close();
    }
}
