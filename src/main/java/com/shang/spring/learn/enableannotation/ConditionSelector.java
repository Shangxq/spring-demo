package com.shang.spring.learn.enableannotation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class ConditionSelector implements ImportSelector {
    public static String PACKAGE_NAME = "com.shang.spring.learn.enableannotation.";

    @Override
    public String[] selectImports(final AnnotationMetadata importingClassMetadata) {
        Map map = importingClassMetadata.getAnnotationAttributes(ConditionConfigAnnotation.class.getName());
        return new String[]{ConditionSelector.PACKAGE_NAME + map.get("value").toString()};
    }
}
