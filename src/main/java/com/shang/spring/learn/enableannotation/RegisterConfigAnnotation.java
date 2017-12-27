package com.shang.spring.learn.enableannotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RegisterDefinitionRegistor.class)
public @interface RegisterConfigAnnotation {
    String value() default "默认";
    String name() default "default";
}
