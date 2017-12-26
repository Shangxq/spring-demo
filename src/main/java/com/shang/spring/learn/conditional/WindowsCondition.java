package com.shang.spring.learn.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Arrays;

public class WindowsCondition implements Condition{
    @Override
    public boolean matches(final ConditionContext context, final AnnotatedTypeMetadata metadata) {
        return Arrays.asList(context.getEnvironment().getActiveProfiles()).contains("dev");
//        return context.getEnvironment().getProperty("os.name").toLowerCase().contains("windows");
    }
}
