package com.shang.spring.learn.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan("com.shang.spring.learn.prepost")
public class BeanConfig {
    @Bean(initMethod = "init",destroyMethod = "destoryA")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean("messageSource")//如果方法名叫messageSource就不需要指定bean名字
    ResourceBundleMessageSource getI18n(){
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
