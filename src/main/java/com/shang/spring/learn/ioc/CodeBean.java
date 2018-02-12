package com.shang.spring.learn.ioc;

public class CodeBean {
    DynamicCreateBean bean;

    public int getProperty() {
        return property;
    }

    public void setProperty(final int property) {
        this.property = property;
    }

    int property;
    CodeBean(DynamicCreateBean bean){
        bean.printMethod();
        this.bean = bean;
    }
    public void say(){
        System.out.println("你好啊"+ property+ "   "+this.toString());
    }
}
