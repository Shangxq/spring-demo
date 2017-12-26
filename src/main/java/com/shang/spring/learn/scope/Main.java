package com.shang.spring.learn.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoPrototypeService demoPrototypeService=context.getBean(DemoPrototypeService.class);
        DemoPrototypeService demoPrototypeService1=context.getBean(DemoPrototypeService.class);
        DemoSingletonService demoSingletonService=context.getBean(DemoSingletonService.class);
        DemoSingletonService demoSingletonService1=context.getBean(DemoSingletonService.class);
        System.out.println((demoPrototypeService==demoPrototypeService1)+" "+(demoSingletonService==demoSingletonService1));
        context.close();
    }
}
