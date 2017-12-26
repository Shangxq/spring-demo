package com.shang.spring.learn.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.nio.charset.Charset;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String beanName;
    private ResourceLoader resourceLoader;

    @Override
    public void setBeanName(final String s) {
        this.beanName = s;
    }

    @Override
    public void setResourceLoader(final ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outputResult() {
        System.out.println("bean名称：" + beanName);
        Resource resource = resourceLoader.getResource("classpath:hello.txt");
        try {
            System.out.println(IOUtils.toString(resource.getInputStream(), Charset.forName("UTF-8")));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
