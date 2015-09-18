/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex01;

import java.util.HashMap;



/**
 *
 * @author Dethrall
 */
public class School {
    private String name;
    private HashMap<Integer, Student> studentMap = new HashMap();

    
    public static void main(String[] args) {
        School school = new School("HSLU");
        
        Student s1 = new Student("Marcel", "von Wyl", "PRG2");
        Student s2 = new Student("Adrian", "Gebs", "PRG2");
        
        school.enrolStudent(s1);
        school.enrolStudent(s2);
        
        school.printStudents();
    }
    
    
    public School(String name) {
        this.name = name;
    }

    public void enrolStudent(Student student){
        studentMap.put(student.getStudentNumber(), student);
    }
    
    public void printStudents(){
        for (Student student : studentMap.values()){
            student.print();
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Integer, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(HashMap<Integer, Student> StudentMap) {
        this.studentMap = StudentMap;
    }
    
    
}
