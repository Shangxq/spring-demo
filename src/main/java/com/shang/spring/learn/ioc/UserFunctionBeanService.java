package com.shang.spring.learn.ioc;

public class UserFunctionBeanService {
    FunctionBean functionBean;
    public void setFunctionBean(FunctionBean functionBean){
        this.functionBean=functionBean;
    }
    public String sayHi(String word){
        return functionBean.sayHello(word);
    }
}
