package com.shang.spring.learn.ioc;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.annotation.Autowired;

public class DatePropertyEditorRegistrar implements PropertyEditorRegistrar {
    DatePropertyEditor editor =  new DatePropertyEditor();
    @Override
    public void registerCustomEditors(final PropertyEditorRegistry registry) {
        registry.registerCustomEditor(java.util.Date.class,editor);
    }
}
