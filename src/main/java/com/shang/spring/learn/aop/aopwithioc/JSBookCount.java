package com.shang.spring.learn.aop.aopwithioc;

import org.springframework.stereotype.Component;

@Component
public class JSBookCount implements BookCount {
    @Override
    public int getCount() {
        return 50;
    }
}
