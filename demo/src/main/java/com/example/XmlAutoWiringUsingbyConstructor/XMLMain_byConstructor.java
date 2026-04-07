package com.example.XmlAutoWiringUsingbyConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLMain_byConstructor {
    public static void main(String[] args) {
        String config_File = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_File);
        Student std  = (Student)  context.getBean("std");
        std.display();
    }
}
