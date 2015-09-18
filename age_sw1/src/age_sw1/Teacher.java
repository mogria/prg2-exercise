/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_sw1;

/**
 *
 * @author Adrian
 */
public class Teacher extends Person{
    private String subject;
    private Double salary;
    private static int number;
    private int TeacherNumber;

    public Teacher(String name, String firstname) {
        super(name, firstname);
    }

    public Teacher(String subject, Double salary, String name, String firstname) {
        super(name, firstname);
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
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    
    @Override
    public void print()
    {
        System.out.println(super.getName() + " " + super.getFristname() + " " + salary.toString() + " " + subject);
    }
    
}
