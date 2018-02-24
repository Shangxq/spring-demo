package com.shang.spring.learn.aop.aopwithioc;

public class JavaBookCount implements BookCount {
    private  int count = 100;
    @Override
    public int getCount() {
        return count;
    }
}
