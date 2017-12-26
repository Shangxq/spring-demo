package com.shang.spring.learn.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService annotationService=configApplicationContext.getBean(DemoAnnotationService.class);
        DemoMethodService methodService=configApplicationContext.getBean(DemoMethodService.class);
        annotationService.add();
        methodService.add();
        configApplicationContext.close();
    }
}
