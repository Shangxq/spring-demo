package com.shang.spring.learn.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.shang.spring.learn.conditional")
public class ConditionConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListDirService getWindowsListDirService(){
        return new WindowsListDirServiceImp();
    }
    @Bean
    @Conditional(LinuxCondition.class)
    public ListDirService getLinuxListDirService(){
        return new LinuxListDirServiceImp();
    }
}
