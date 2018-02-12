package com.shang.spring.learn.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
@Component
@PropertySource("test.properties")
public class DateBean {
    @Value("${book.name}")
    Date date;
    public void sayDate(){
        System.out.println(this.date);
    }
}
