package com.shang.spring.learn.aop.DynamicProxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RequestCtrlInvocationHandle implements InvocationHandler {
    private static final Log logger= LogFactory.getLog(RequestCtrlInvocationHandle.class);
    private Object target;

    public RequestCtrlInvocationHandle(final Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
        logger.info(method.getName());
        if(method.getName().equals("request")){
            logger.info("requet is comming do something");
            if(!args[0].equals("shang")){
                logger.warn("你不是主人");
                return null;
            }
            return method.invoke(target,args);
        }
        return null;
    }
}
