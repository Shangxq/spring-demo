package com.shang.spring.learn.aop.aopwithioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(Config.class);
        annotationConfigApplicationContext.refresh();
//        BookCount bookCount= (BookCount) annotationConfigApplicationContext.getBean("countProxy");
        BookCount bookCount = (BookCount) annotationConfigApplicationContext.getBean("javaBookCount");
//        BookCount bookCount= annotationConfigApplicationContext.getBean(BookCount.class);
        BookCount bookCount2 = (BookCount) annotationConfigApplicationContext.getBean("JSBookCount");
        TestBookCount testBookCount = annotationConfigApplicationContext.getBean(TestBookCount.class);
        testBookCount.say();
        System.out.println(testBookCount.getCount());
        System.out.println(bookCount.getCount());
        System.out.println(bookCount2.getCount());
    }
}
