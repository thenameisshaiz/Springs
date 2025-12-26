package com.jspiders.springs.demo.runner;

import com.jspiders.springs.AppConfig;
import com.jspiders.springs.demo.model.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationDemo02 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Employee emp1 = context.getBean("employee", Employee.class);
        System.out.println(emp1.getId());
        System.out.println(emp1.getContact());
        System.out.println(emp1.getAddress());
    }
}
