package com.shang.spring.learn.annotation;

import com.shang.spring.learn.aop.DemoAnnotationService;
import com.shang.spring.learn.ioc.FunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService service=context.getBean(DemoService.class);
        service.outPut();
        FunctionService service1=context.getBean(FunctionService.class);
        System.out.println(service1.sayHello("尚晓琼"));
        context.close();
    }
}
