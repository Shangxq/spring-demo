package com.shang.spring.learn.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public FunctionBean functionBean(){
        return new FunctionBean();
    }
    @Bean
    public UserFunctionBeanService userFunctionBeanService(){
        UserFunctionBeanService userFunctionBeanService=new UserFunctionBeanService();
        userFunctionBeanService.setFunctionBean(functionBean());
        return userFunctionBeanService;
    }
}
