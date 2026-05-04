package com.example.ioc.mobilo_sims;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("jina")
@Primary
public class Jio implements Sim {

    @Override
    public void calling() {
        System.out.println("Jio Calling");
    }

    @Override
    public void data() {
        System.out.println("Jio Data Calling");
    }
}
