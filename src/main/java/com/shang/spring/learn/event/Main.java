package com.shang.spring.learn.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(EventConfig.class);
        context.getBean(DemoPublisher.class).publish("hahha");
        context.close();
    }
}
