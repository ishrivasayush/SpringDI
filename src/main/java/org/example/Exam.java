package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        /*
        Student student=new Student();
        student.studentName="Ayush Shrivastava";
        student.setStudentName("Ayush Shrivastava");
        student.displayStudentInfo();
        */

        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
        Student ayush =context.getBean("student",Student.class);
        ayush.displayStudentInfo();
    }
}
