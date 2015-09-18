/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw1;

/**
 *
 * @author Diego
 */
public class Student extends Person {
    
    private final int studentNumber;
    private int course;
    
    private static int number = 1000;
    
    /**
     * 
     * @param name
     * @param firstName 
     */
    public Student(String name, String firstName) {
        super(name, firstName);
        this.studentNumber = number;
        number ++;
    }

    /**
     * 
     * @param course
     * @param name
     * @param firstName 
     */
    public Student(int course, String name, String firstName) {
        this(name, firstName);
        this.course = course;
    }

    /**
     * @return the studentNumber
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * @return the course
     */
    public int getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(int course) {
        this.course = course;
    } 
    
    @Override
    public void printAttributes(){
        System.out.println("Firstname: " + this.studentNumber);
        System.out.println("Firstname: " + getFirstName());
        System.out.println("Name: " + getName());
        System.out.println("Course: " + this.course);
    }

}
