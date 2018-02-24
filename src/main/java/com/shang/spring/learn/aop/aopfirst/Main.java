package com.shang.spring.learn.aop.aopfirst;

import com.shang.spring.learn.aop.AopConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext=new AnnotationConfigApplicationContext(AopConfig.class);
        configApplicationContext.getBean(TestBean.class).getAbc();
    }
}
