package com.shang.spring.learn.profile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProfileDemoBean {
    private String content;
    public ProfileDemoBean(String content){
        super();
        this.content=content;
    }
}
