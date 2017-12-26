package com.shang.spring.learn.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan("com.shang.spring.learn.profile")
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public ProfileDemoBean devDemoBean(){
        return new ProfileDemoBean("dev");
    }

    @Bean
    @Profile("prod")
    public ProfileDemoBean prodDemoBean(){
        return new ProfileDemoBean("prod");
    }

    @Bean
    public ProfileDemoBean demoBean(){
        return new ProfileDemoBean("all");
    }
}
