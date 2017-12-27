package com.shang.spring.learn.enableannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(TotalConfig.class);
        context.getBean(ImportBean.class).say();
        System.out.println(context.getBean(ConditionBean.class).getCondition());
        context.getBean(RegisterBean.class).say();
        context.getBean(RegisterBean.class).introduce();
        context.close();
    }
}
