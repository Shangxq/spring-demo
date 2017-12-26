package com.shang.spring.learn.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ConditionConfig.class);
        context.refresh();
        ListDirService service=context.getBean(ListDirService.class);
        System.out.println(service.showCmd());
        context.close();
    }
}
