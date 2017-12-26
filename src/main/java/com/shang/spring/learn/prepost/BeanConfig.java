package com.shang.spring.learn.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.shang.spring.learn.prepost")
public class BeanConfig {
    @Bean(initMethod = "init",destroyMethod = "destoryA")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
}
