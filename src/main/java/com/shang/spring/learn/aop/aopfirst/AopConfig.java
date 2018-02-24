package com.shang.spring.learn.aop.aopfirst;

import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
public class AopConfig {
    @Bean
    NameMatchMethodPointcut nameMatchMethodPointcut(){
        NameMatchMethodPointcut nameMatchMethodPointcut =new NameMatchMethodPointcut();
        nameMatchMethodPointcut.addMethodName("getAbc");
        return nameMatchMethodPointcut;
    }
}
