package com.example.DI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createobj() {
        Address addr = new Address();
        addr.setCity("Mumbai");
        addr.setPincode(400101);
        addr.setHouseno(123);
        return addr;

    }
    @Bean
    public Student createstudent(){
        Student stdid = new Student();
        stdid.setAddress(createobj());
        stdid.setName("Raju");
        stdid.setRollno(420);
        return stdid;
    }
}
