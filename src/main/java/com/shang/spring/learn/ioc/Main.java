package com.shang.spring.learn.ioc;

import org.apache.log4j.BasicConfigurator;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext();
        ConfigurableBeanFactory factory=annotationConfigApplicationContext.getBeanFactory();
        annotationConfigApplicationContext.register(DiConfig.class);
        annotationConfigApplicationContext.register(JavaConfig.class);
        annotationConfigApplicationContext.refresh();
        System.out.println("-------------------scope test ---------------");
        ThreadScope threadScope = new ThreadScope();
        factory.registerScope("thread",threadScope);
        AbstractBeanDefinition beanDefinition1= new RootBeanDefinition(ScopeBean.class);
        beanDefinition1.setScope("thread");
        annotationConfigApplicationContext.registerBeanDefinition("scopeTest",beanDefinition1);
        annotationConfigApplicationContext.getBean(ScopeBean.class).say();
        Thread thread =new Thread(()->{
            annotationConfigApplicationContext.getBean(ScopeBean.class).say();
        });
        thread.start();
        System.out.println("-------------------scope test ---------------");

        factory.registerSingleton("dynamicCreateBean",new DynamicCreateBean());
        AbstractBeanDefinition beanDefinition = new RootBeanDefinition(CodeBean.class,0,true);
        ConstructorArgumentValues value = new ConstructorArgumentValues();
        value.addIndexedArgumentValue(0,factory.getBean("dynamicCreateBean"));
        beanDefinition.setConstructorArgumentValues(value);
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("property",10));
        beanDefinition.setPropertyValues(propertyValues);
        annotationConfigApplicationContext.registerBeanDefinition("nihao",beanDefinition);
        factory.getBean(CodeBean.class).say();
        System.out.println(Arrays.toString(annotationConfigApplicationContext.getBeanDefinitionNames()));
        factory.getBean(CodeBean.class).say();
        annotationConfigApplicationContext.getBean(DynamicCreateBean.class).printMethod();
        FunctionService functionService=annotationConfigApplicationContext.getBean(FunctionService.class);
        System.out.println(functionService.sayHello("shang"));
        UserFunctionBeanService userFunctionBeanService= (UserFunctionBeanService) annotationConfigApplicationContext.getBean("userFunctionBeanService");
        System.out.println(userFunctionBeanService.sayHi(" nihao"));

        annotationConfigApplicationContext.close();
    }
}
