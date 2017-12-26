package com.shang.spring.learn.el;

import org.apache.log4j.BasicConfigurator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ResourceConfig.class);
        ElConfig bean=context.getBean(ElConfig.class);
        bean.outputResource();
        context.close();
    }


}
