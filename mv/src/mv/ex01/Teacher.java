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
public class Teacher extends Person{
    private String subject;
    private Double salary;

    public Teacher(String firstname, String lastname) {
        super(firstname, lastname);
    }

    public Teacher(String subject, Double salary, String firstname, String lastname) {
        super(firstname, lastname);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void print(){
        System.err.println(getFirstname() + " " + getLastname() + " - " + subject + " - " + salary);
    }
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    
}
