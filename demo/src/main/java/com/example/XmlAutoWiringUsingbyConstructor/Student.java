package com.example.XmlAutoWiringUsingbyConstructor;

public class Student {
    private String name;
    private  int rollno;
    private  Address address;

    public Student(Address address, String name, int rollno) {
        this.address = address;
        this.name = name;
        this.rollno = rollno;
    }

   
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("Address:"+address);
    }
    
}
