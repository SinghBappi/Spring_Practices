package com.example.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBC_MAIN {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        // int std_rollno = 35;
        // String std_name = "Bappi";
        // float std_marks = 94.34f;

        // String Insert_Query = "Insert into student values(?,?,?);";
        // int count = jdbcTemplate.update(Insert_Query,std_rollno,std_name,std_marks);
        // if(count>0){
        // System.out.println("Insertion Done !");
        // }
        // else{
        // System.out.println("Error Occured ! While Insertion !");

        // }

        // int std_rollno = 37;
        // String std_name = "Preet";
        // float std_marks = 74.34f;

        // String Insert_Query = "Insert into student values(?,?,?);";
        // int count = jdbcTemplate.update(Insert_Query,std_rollno,std_name,std_marks);
        // if(count>0){
        // System.out.println("Insertion Done !");
        // }
        // else{
        // System.out.println("Error Occured ! While Insertion !");

        // }
        // ===================== UPDATE SECTION ============================ //

        // float marks = 99.9f;
        // int rollno = 35;
        // String Update_Query = "Update student set std_marks = ? where std_roll = ? ";
        // int count = jdbcTemplate.update(Update_Query,marks,rollno);
        // if(count>0)
        // {
        // System.out.println("Updatation Complete");

        // }
        // else{
        // System.out.println("Updatation Failed !");
        // }

        // === DELETION ===

        // int rollno = 37;
        // String name = "Preet";
        // String Delete_Query = "Delete from student where std_name = ?";
        // int count = jdbcTemplate.update(Delete_Query,name);
        // if (count>0) {
        // System.out.println("Deletion done");

        // }
        // else{
        // System.out.println("Deletion Failed !");
        // }

        // ==== Selection ====

        // String Selection_Query = "Select * from student";
        // List <Student> std_list = jdbcTemplate.query(Selection_Query, new
        // StudentRowMapper());
        // for (Student student : std_list) {
        // System.out.println("==================================Selection Query Passed
        // ! ===================================");
        // System.out.println("Student Name:"+ student.getName());
        // System.out.println("Student Marks:"+ student.getMarks());
        // System.out.println("Student Rollno:"+ student.getRollno());
        // // System.out.println("==================================Selection Query
        // Passed ! ===================================");
        // }

        // String Selection_Query = "Select * from student where std_roll =?";
        // int  rollno = 35;
        // List<Student> std_list = jdbcTemplate.query(Selection_Query, new StudentRowMapper(),rollno);
        // for (Student student : std_list) {
        //     System.out.println(
        //             "==================================Selection Query Passed ! ===================================");
        //     System.out.println("Student Name:" + student.getName());
        //     System.out.println("Student Marks:" + student.getMarks());
        //     System.out.println("Student Rollno:" + student.getRollno());
        //     // System.out.println("==================================Selection Query Passed
        //     // ! ===================================");
        // }



        
        String Selection_Query = "Select * from student where std_roll =?";
        int  rollno = 35;
        Student std = jdbcTemplate.queryForObject(Selection_Query, new StudentRowMapper(),rollno);
        // for (Student student : std_list) {
            System.out.println(
                    "==================================Selection Query Passed ! ===================================");
            System.out.println("Student Name:" + std.getName());
            System.out.println("Student Marks:" + std.getMarks());
            System.out.println("Student Rollno:" + std.getRollno());
            // System.out.println("==================================Selection Query Passed
            // ! ===================================");
        // }




    }
}
