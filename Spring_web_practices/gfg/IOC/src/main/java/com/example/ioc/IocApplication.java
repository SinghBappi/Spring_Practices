package com.example.ioc;

import com.example.ioc.Java_Based_configure.Appconfigure;
import com.example.ioc.mobilo_sims.Sim;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
class  Mobilo{
//    @Qualifier("jina")
@Qualifier("airtel")

@Autowired
    private Sim sim;
    public void useSim(){
        sim.calling();
        sim.data();
    }
}
@SpringBootApplication
public class IocApplication {

    public static void main(String[] args) {
//        SpringApplication.run(IocApplication.class, args);
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        Sim sim = context.getBean("sim",Sim.class);
////    sim.
//        sim.calling();
//        sim.data();

//
//        ApplicationContext context  = new AnnotationConfigApplicationContext(Appconfigure.class);
//        Sim sim = context.getBean(Sim.class);
//        sim.calling();
//        sim.data();

//        ApplicationContext context  = new AnnotationConfigApplicationContext(Appconfigure.class);
        ApplicationContext context = SpringApplication.run(IocApplication.class, args);
        Mobilo mob = context.getBean(Mobilo.class);
        mob.useSim();




    }






//    Mobile mob = new Mobile();


}

