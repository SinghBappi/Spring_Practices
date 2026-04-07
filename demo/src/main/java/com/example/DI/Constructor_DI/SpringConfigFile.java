package com.example.DI.Constructor_DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createobj() {
        Address addr = new Address(123,"Mumbai",400101);
        // addr.setCity("Mumbai");
        // addr.setPincode(400101);
        // addr.setHouseno(123);
        return addr;

    }
    @Bean
    public Student createstudent(){
        Student stdid = new Student("Baju",420,createobj());
        // stdid.setAddress(createobj());
        // stdid.setName("Raju");
        // stdid.setRollno(420);
        return stdid;
    }
}
