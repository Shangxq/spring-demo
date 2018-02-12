package com.shang.spring.learn.event;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TestPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(final Object bean, final String beanName) throws BeansException {
        System.out.println("_____________"+beanName+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(final Object bean, final String beanName) throws BeansException {
        System.out.println("+++++++++++++"+beanName+bean);
        return bean;
    }
}
