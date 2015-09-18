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
public class Student extends Person{
    private int StundentNumber;
    private String course;
    private static int number = 1000;

    public Student(String course, String name, String firstname) {
        super(name, firstname);
        this.course = course;
        this.StundentNumber = number;
        Student.number = Student.number +1;
    }

    public Student(String name, String firstname) {
        super(name, firstname);
        this.StundentNumber = number;
        Student.number = Student.number +1;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the StundentNumber
     */
    public int getStundentNumber() {
        return StundentNumber;
    }
    
    @Override
    public void print()
    {
         System.out.println(super.toString() + " " + course);
    }
    
}
