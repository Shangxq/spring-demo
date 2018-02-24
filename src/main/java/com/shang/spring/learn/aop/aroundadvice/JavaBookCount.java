package com.shang.spring.learn.aop.aroundadvice;

public class JavaBookCount implements BookCount{
    private  int count = 108;
    @Override
    public int getCount() {
        return count;
    }
}
