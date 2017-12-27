package com.shang.spring.learn.enableannotation;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class RegisterDefinitionRegistor implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(final AnnotationMetadata importingClassMetadata, final BeanDefinitionRegistry registry) {
        String context = importingClassMetadata.getAnnotationAttributes(RegisterConfigAnnotation.class.getName()).get("value").toString();
        String name = importingClassMetadata.getAnnotationAttributes(RegisterConfigAnnotation.class.getName()).get("name").toString();
        BeanDefinitionBuilder definitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(RegisterBean.class);
        //添加属性
        definitionBuilder.addPropertyValue("context", context);
        //添加构造参数（顺序添加）
        definitionBuilder.addConstructorArgValue(name);
        registry.registerBeanDefinition("registerBean", definitionBuilder.getBeanDefinition());
    }
}
