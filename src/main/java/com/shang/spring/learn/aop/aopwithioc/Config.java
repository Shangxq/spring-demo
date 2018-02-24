package com.shang.spring.learn.aop.aopwithioc;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class Config {
    @Bean
    NameMatchMethodPointcut pointcut(){
        NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();
        nameMatchMethodPointcut.setMappedName("getCount");
        return nameMatchMethodPointcut;
    }
    @Bean
    DiscountMethodInterceptor discountMethodInterceptor(){
        DiscountMethodInterceptor discountMethodInterceptor =new DiscountMethodInterceptor();
        discountMethodInterceptor.setCampaignAvailable(true);
        return discountMethodInterceptor;
    }
    @Bean
    @Autowired
    DefaultPointcutAdvisor defaultPointcutAdvisor(NameMatchMethodPointcut pointcut,DiscountMethodInterceptor discountMethodInterceptor){
        DefaultPointcutAdvisor defaultPointcutAdvisor= new DefaultPointcutAdvisor();
        defaultPointcutAdvisor.setPointcut(pointcut);
        defaultPointcutAdvisor.setAdvice(discountMethodInterceptor);
        return defaultPointcutAdvisor;
    }
    @Bean
    JavaBookCount javaBookCount(){
        return new JavaBookCount();
    }
    //通过ProxyFactoryBean
//    @Bean
//    @Autowired
//    ProxyFactoryBean countProxy(JavaBookCount javaBookCount){
//        ProxyFactoryBean proxyFactoryBean =new ProxyFactoryBean();
//        proxyFactoryBean.setTarget(javaBookCount);
//        try {
//            proxyFactoryBean.setProxyInterfaces(new Class[]{BookCount.class});
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        proxyFactoryBean.setInterceptorNames("defaultPointcutAdvisor");
//        return proxyFactoryBean;
//    }
    //通过AutoProxyCreator（半自动）
//    @Bean
//    BeanNameAutoProxyCreator beanNameAutoProxyCreator(){
//       BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//       beanNameAutoProxyCreator.setBeanNames("*BookCount");
//       beanNameAutoProxyCreator.setInterceptorNames("defaultPointcutAdvisor");
//       return beanNameAutoProxyCreator;
//    }
    //通过AutoProxyCreator（全自动）
    @Bean
    DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator(){
        return new DefaultAdvisorAutoProxyCreator();
    }

}
