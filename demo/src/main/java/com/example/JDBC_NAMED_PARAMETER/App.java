package com.example.JDBC_NAMED_PARAMETER;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class App {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        NamedParameterJdbcTemplate npjJdbcTemplate  = context.getBean(NamedParameterJdbcTemplate.class);
        
        Map<String,Object> map = new HashMap<>();
        map.put("key_rollno",37);
        map.put("key_name","Rahul");
        map.put("key_marks",88.8f);
        String Insert_Query = "INSERT INTO STUDENT VALUES(:key_rollno,:key_name,:key_marks)";
        int count = npjJdbcTemplate.update(Insert_Query,map); 
        
        if(count>0){
            System.out.println("Insertion Success");
            
        }
        else{
            System.out.println("Insertion Failed !");
        }
    }
    

}
