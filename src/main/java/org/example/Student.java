package org.example;

public class Student {
    private String studentName;
    private int id;

    public Student() {
    }

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
    }

    /*
    public void setId(int id) {
        this.id = id;
    }

    //Setter Injection for litirals
    public void setStudentName(String studentName)
    {
        this.studentName=studentName;
    }

     */


    public void displayStudentInfo()
    {
        System.out.println(studentName);
        System.out.println(id);
    }
}
