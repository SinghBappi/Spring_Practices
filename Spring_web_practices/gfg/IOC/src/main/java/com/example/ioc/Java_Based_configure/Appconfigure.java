package com.example.ioc.Java_Based_configure;

import com.example.ioc.mobilo_sims.Airtel;
import com.example.ioc.mobilo_sims.Sim;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfigure {
    @Bean
    public Sim sim(){
        return new Airtel();
    }
}
