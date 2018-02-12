package com.shang.spring.learn.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {
    @Autowired
    ApplicationEventPublisher eventPublisher;
    public void publish(String message){
        eventPublisher.publishEvent(new DemoEvent(this,message+eventPublisher));
    }
}
