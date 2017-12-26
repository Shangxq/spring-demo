package com.shang.spring.learn.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.shang.spring.learn.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
