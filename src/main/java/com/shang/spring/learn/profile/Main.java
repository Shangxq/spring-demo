package com.shang.spring.learn.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(ProfileConfig.class);
        context.getEnvironment().setActiveProfiles("prod");
        context.refresh();
        System.out.println(((ProfileDemoBean)context.getBean("prodDemoBean")).getContent());

    }
}
