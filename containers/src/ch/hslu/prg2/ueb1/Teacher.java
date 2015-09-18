/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.ueb1;

/**
 *
 * @author mogria
 */
public class Teacher extends Person {

    
    String subject;
    int salary;
    
    public Teacher(String name, String firstname) {
        super(name, firstname);
    }

    public Teacher(String subject, int salary, String name, String firstname) {
        this(name, firstname);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Student[name = '" + getName() + "', firstname = '" + getFirstname() + "', subject = '" + subject + "', salary = '" + salary + "']");
    }
    
    
    
}
