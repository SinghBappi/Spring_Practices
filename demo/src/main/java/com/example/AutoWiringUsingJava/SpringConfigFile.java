package com.example.AutoWiringUsingJava;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringConfigFile {
    @Bean
    public Student CreateStudentObj1(){
        Student std = new Student();
        std.setName("Kaju");
        std.setRollno(1111);
        // std.setAddress(CreateAddressObj());
        return std;
    }

    // @Bean
    // public Student CreateStudentObj2(){
    //     Student std = new Student();
    //     std.setName("Harshit");
    //     std.setRollno(3715);
    //     // std.setAddress(CreateAddressObj());
    //     return std;
    // }
    @Bean
    public Address CreateAddressObj1(){
        Address addr = new Address();
        addr.setCity("Chandigarh");
        addr.setHouseno(123);
        addr.setPincode(12345678);
        
        return addr;
    }

    @Bean
    public Subject CreateSubjectObj(){
        Subject sub = new Subject();
        List<String> subo = new ArrayList<String>();
        subo.add("Java");
        subo.add("Python");
        subo.add("C++");
        sub.setSubjects(subo);
        return sub;
    }

     @Bean
    public Address CreateAddressObj2(){
        Address addr = new Address();
        addr.setCity("Mumbai Suburban");
        addr.setHouseno(44444);
        addr.setPincode(400101);
        
        return addr;
    }
}
