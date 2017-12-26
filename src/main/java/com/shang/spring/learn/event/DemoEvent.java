package com.shang.spring.learn.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class DemoEvent extends ApplicationEvent {
    private String msg;
    public DemoEvent(final Object source,String msg) {
        super(source);
        this.msg=msg;
    }
}
