package com.jspiders.springs.demo.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main02 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        LifeCycleDemo lcd = context.getBean("lifecycle", LifeCycleDemo.class);
        lcd.beansUse();
    }
}
