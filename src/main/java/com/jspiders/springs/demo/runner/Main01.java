package com.jspiders.springs.demo.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main01 {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to Springs!");
        System.out.println("Program starts");

//        Loading the configuration which is present in "beans.xml" file.
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Sample s1 = context.getBean("Sample",Sample.class);

//        Sample s1 = new Sample();
        s1.increment();
        s1.showValue();

        s1.decrement();
        s1.showValue();
        System.out.println("Program ends");
    }
}