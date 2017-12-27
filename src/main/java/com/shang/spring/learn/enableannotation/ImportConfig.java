package com.shang.spring.learn.enableannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ImportConfig {
    @Bean
    public ImportBean getTestBean(){
        ImportBean bean=new ImportBean();
        bean.setContext("nihao");
        return bean;
    }
}
