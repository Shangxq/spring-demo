package com.shang.spring.learn.taskscheduler;

import com.shang.spring.learn.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
    }
}
