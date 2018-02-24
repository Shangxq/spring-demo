package com.shang.spring.learn.aop.aroundadvice;

import org.springframework.aop.framework.ProxyFactory;

public class Main {
    public static void main(String[] args) {
        DiscountMethodInterceptor interceptor = new DiscountMethodInterceptor();
        interceptor.setCampaignAvailable(true);
        BookCount count = new JavaBookCount();
        ProxyFactory proxyFactory = new ProxyFactory(count);
        proxyFactory.setInterfaces(BookCount.class);
        proxyFactory.addAdvice(interceptor);
        BookCount proxy = (BookCount) proxyFactory.getProxy();
        System.out.println("============================");
        ProxyFactory proxyFactory1 = new ProxyFactory(new BookCountCGLib());
        proxyFactory1.addAdvice(interceptor);
        BookCountCGLib proxy1 =(BookCountCGLib) proxyFactory1.getProxy();
        System.out.println(proxy.getCount()+"-----"+ proxy1.getCount());
    }
}
