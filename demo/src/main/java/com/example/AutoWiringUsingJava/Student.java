package com.example.AutoWiringUsingJava;

// package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Student {
    private  String name;
    private int rollno;
    @Autowired
    private Subject subjects;
    @Autowired
    @Qualifier("CreateAddressObj2")
    private Address address;

    // public Student(Address address, String name, int rollno) {
    //     this.address = address;
    //     this.name = name;
    //     this.rollno = rollno;
    // }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    // public Address getAddress() {
    //     return address;
    // }

    // public void setAddress(Address address) {
    //     this.address = address;
    // }
    public void display(){
        System.out.println("Rollno"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Subjects:"+subjects);

    }
}
