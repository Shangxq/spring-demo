package com.shang.spring.learn.enableannotation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ImportBean {
    String context;
    public void say(){
        System.out.println(context);
    }
}
