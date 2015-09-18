/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw1;
import java.util.HashMap;

/**
 *
 * @author Diego
 */
public class School {
    
    private String name;
    private HashMap <Integer, Student> studentList; 

    public School(String name) {
        this.name = name;
        studentList = new HashMap <Integer, Student>();
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
    
    
    
    
    
}
