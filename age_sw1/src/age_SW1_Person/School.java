/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW1_Person;
import java.util.HashMap;
/**
 *
 * @author Adrian
 */
public class School {
    private String name;
    private HashMap<Integer,Student> studentList;

    public School(String name) {
        studentList = new HashMap<Integer,Student>();
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    public void EnroleStudent(Student stud)
    {
        studentList.put(stud.getStundentNumber(),stud);
    }
    
    public void print()
    {
        for(Student stud : studentList.values())
        {
            stud.print();
        }
    }
}
