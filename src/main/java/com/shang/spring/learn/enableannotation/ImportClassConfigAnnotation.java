package com.shang.spring.learn.enableannotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ImportConfig.class)
public @interface ImportClassConfigAnnotation {
}
