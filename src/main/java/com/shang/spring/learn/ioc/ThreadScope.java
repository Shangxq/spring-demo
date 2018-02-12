package com.shang.spring.learn.ioc;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.HashMap;
import java.util.Map;
public class ThreadScope implements Scope {
    private final ThreadLocal threadScope=new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return new HashMap();
        }
    };

    @Override
    public Object get(final String name, final ObjectFactory<?> objectFactory) {
        Map scope = (Map) threadScope.get();
        Object object = scope.get(name);
        if(object ==null){
            object = objectFactory.getObject();
            scope.put(name,object);
        }
        return object;
    }

    @Override
    public Object remove(final String name) {
        Map scope = (Map) threadScope.get();
        return scope.remove(name);
    }

    @Override
    public void registerDestructionCallback(final String name, final Runnable callback) {
        System.out.println("registerDestruction");
    }

    @Override
    public Object resolveContextualObject(final String key) {
        System.out.println("resolveContextual");
        return null;
    }

    @Override
    public String getConversationId() {
        System.out.println("getConversation");
        return null;
    }
}
