package com.shang.spring.learn.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class DemoListerner implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(final DemoEvent demoEvent) {
        System.out.println(demoEvent.getMsg());
    }
}
