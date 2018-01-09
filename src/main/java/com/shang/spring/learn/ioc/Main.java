package com.shang.spring.learn.ioc;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(DiConfig.class);
        annotationConfigApplicationContext.register(JavaConfig.class);
        annotationConfigApplicationContext.refresh();
        ConfigurableBeanFactory factory=annotationConfigApplicationContext.getBeanFactory();
        factory.registerSingleton("dynamicCreateBean",new DynamicCreateBean());
        annotationConfigApplicationContext.getBean(DynamicCreateBean.class).printMethod();
        FunctionService functionService=annotationConfigApplicationContext.getBean(FunctionService.class);
        System.out.println(functionService.sayHello("shang"));
        UserFunctionBeanService userFunctionBeanService= (UserFunctionBeanService) annotationConfigApplicationContext.getBean("userFunctionBeanService");
        System.out.println(userFunctionBeanService.sayHi(" nihao"));
        annotationConfigApplicationContext.close();
    }
}
