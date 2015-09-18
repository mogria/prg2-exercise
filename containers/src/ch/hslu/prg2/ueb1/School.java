package ch.hslu.prg2.ueb1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mogria
 */
public class School {
    private String name;
    private HashMap<Integer, Student> studentList;

    public School(String name) {
        this.name = name;
        this.studentList = new HashMap<>();
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
     * @return the studentList
     */
    public HashMap<Integer, Student> getStudentList() {
        return studentList;
    }
    
    public void enrolStudent(Student newStudent) {
        studentList.put(newStudent.getStudentNumber(), newStudent);
    }
    
    public void printStudents() {
        
        System.out.println("School[name = '" + name + "', studentList = [");
        for (Student student : studentList.values()) {
            student.print();
        }
        System.out.println("]");
    }
    
}
