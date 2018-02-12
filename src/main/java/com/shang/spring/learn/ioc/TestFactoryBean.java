package com.shang.spring.learn.ioc;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
@Component("myFactory")
public class TestFactoryBean implements FactoryBean<LocalDate> {

    @Override
    public LocalDate getObject() throws Exception {
        return LocalDate.now();
    }

    @Override
    public Class<?> getObjectType() {
        return LocalDate.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
