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
public class Teacher extends Person {
    private String subject;
    private double salary;

    /**
     * 
     * @param name
     * @param firstName 
     */
    public Teacher(String name, String firstName) {
        super(name, firstName);
    }

    /**
     * 
     * @param subject
     * @param salary
     * @param name
     * @param firstName 
     */
    public Teacher(String subject, double salary, String name, String firstName) {
        super(name, firstName);
        this.subject = subject;
        this.salary = salary;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void printAttributes(){
        System.out.println("Firstname: " + getFirstName());
        System.out.println("Name: " + getName());
        System.out.println("Subject: " + this.subject);
        System.out.println("Salary: " + this.salary);
    }
}
