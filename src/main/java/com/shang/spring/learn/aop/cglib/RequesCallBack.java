package com.shang.spring.learn.aop.cglib;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class RequesCallBack implements MethodInterceptor {
    private static final Log logger= LogFactory.getLog(RequesCallBack.class);

    @Override
    public Object intercept(final Object o, final Method method, final Object[] objects, final MethodProxy methodProxy) throws Throwable {
        logger.info(method.getName());
        if(method.getName().equals("request")){
            logger.info("requet is comming do something");
            if(!objects[0].equals("shang")){
                logger.warn("你不是主人");
                return null;
            }
            return methodProxy.invokeSuper(o,objects);
        }
        return null;
    }
}
