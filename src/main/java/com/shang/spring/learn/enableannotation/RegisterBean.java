package com.shang.spring.learn.enableannotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterBean {
    private String context;
    private String name;
    RegisterBean(String name){
        this.name=name;
    }
    public void say(){
        System.out.println(this.context);
    }
    public void introduce(){
        System.out.println(this.name);
    }
}
