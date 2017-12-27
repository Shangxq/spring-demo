package com.shang.spring.learn.fortest;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestBean {
    private String content;

    public TestBean(String content){
        super();
        this.content=content;
    }
}
