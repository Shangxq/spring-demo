package com.shang.spring.learn.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        String filename=context.getMessage("menu.file",new Object[]{"F"},Locale.CHINA);
        String editName=context.getMessage("menu.edit",null,Locale.US);
        System.out.println(filename+ editName);
        context.getBean(BeanWayService.class);
        context.getBean(JSR250WayService.class).say();
        context.close();
    }
}
