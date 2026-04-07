package com.example.XmlAutoWiringUsingbyType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLMain_byType {
    public static void main(String[] args) {
        String config_File = "applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(config_File);
        Student std  = (Student)  context.getBean("std");
        std.display();
    }
}
