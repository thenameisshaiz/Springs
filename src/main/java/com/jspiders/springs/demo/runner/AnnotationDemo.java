package com.jspiders.springs.demo.runner;

import com.jspiders.springs.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Sample s1 = context.getBean("sample", Sample.class);

        s1.showValue();

        s1.increment();
        s1.showValue();
    }
}
