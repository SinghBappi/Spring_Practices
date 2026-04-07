package com.example.DI.Constructor_DI;

// package com.example.demo;

public class Student {
    public String name;
    public int rollno;
    public Address address;

    // public Student(Address address, String name, int rollno) {
    //     this.address = address;
    //     this.name = name;
    //     this.rollno = rollno;
    // }
    

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public int getRollno() {
    //     return rollno;
    // }

    // public void setRollno(int rollno) {
    //     this.rollno = rollno;
    // }

    // public Address getAddress() {
    //     return address;
    // }

    public Student(String name, int rollno, Address address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    // public void setAddress(Address address) {
    //     this.address = address;
    // }
    public void display(){
        System.out.println("Rollno"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);

    }
}
