package com.example.ioc.mobilo_sims;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {
    @Override
    public void calling() {
        System.out.println("Airtel Calling");
    }

    @Override
    public void data() {
        System.out.println("Airtel data");
    }
}
