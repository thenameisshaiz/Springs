package com.jspiders.springs.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionDemo {
    public static void main(String[] args) {
        System.out.println("Program starts");
//        ContactInfo contact = new ContactInfo();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Employee e1 = context.getBean("employee",Employee.class);
        System.out.println(e1.getContact());
        System.out.println("ID: "+e1.getId());
        System.out.println("Name: "+e1.getName());
        System.out.println("Salary: "+e1.getSal());


        System.out.println("Program ends");
    }
}
