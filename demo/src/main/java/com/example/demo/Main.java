package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String confi_file = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(confi_file);
        Student std = (Student) context.getBean("stdid");
        std.display();
    }
}
