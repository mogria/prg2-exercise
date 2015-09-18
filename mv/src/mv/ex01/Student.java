/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex01;

/**
 *
 * @author Dethrall
 */
public class Student extends Person{
    
    private static int number = 1000;
    private final int studentNumber;
    private String course;

    public Student(String firstname, String lastname) {
        super(firstname, lastname);
        studentNumber = number;
        number++;
    }

    public Student(String firstname, String lastname, String course) {
        this(firstname, lastname);
        this.course = course;
    }

    @Override
    public void print(){
        System.out.println(getFirstname() + " " + getLastname() + " - " + course);
    }
    
    public Student(int studentNumber, String course) {
        this.studentNumber = studentNumber;
        this.course = course;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Student.number = number;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
