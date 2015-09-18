/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw1;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Diego
 */
public class School {
    
    private String name;
    private HashMap <Integer, Student> studentList;
    private Iterator itr;
        
    public static void main(String[] args) {
        Student student1 = new Student(10, "Bienz", "Diego");
        Student student2 = new Student(20, "Bucher", "Mario");
        Student student3 = new Student(10, "Brun", "Manuel");
        Student student4 = new Student(30, "Calovic", "Dario");
        School school1 = new School("HSLU");
        
        school1.enrolStudent(student1);
        school1.enrolStudent(student2);
        school1.enrolStudent(student3);
        school1.enrolStudent(student4);
        school1.printStudents();
    }
    
    public School(String name) {
        this.name = name;
        studentList = new HashMap <>();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * 
     * @param student 
     */
    public void enrolStudent(Student student){
        studentList.put(student.getStudentNumber(), student);
    }
    
    /**
     * 
     */
    public void printStudents(){
        itr = studentList.keySet().iterator();
        while(itr.hasNext()){
            studentList.get(itr.next()).printAttributes();
        }
    }  
    
    
}
