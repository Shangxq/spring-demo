package com.shang.spring.learn.el;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class DemoService {
    @Value("其他属性")
    private String another;
}
