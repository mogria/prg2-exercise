/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw1;

/**
 *
 * @author Diego Bienz
 */
public class Person {
    private String name;
    private String firstName;
    
    /**
     * 
     */
    public Person() {
    }

    /**
     * 
     * @param name
     * @param firstName 
     */
    public Person(String name, String firstName){   
        this.name = name;
        this.firstName = firstName;
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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
     *
     */
    public void printAttributes(){
        System.out.println("Firstname: " + this.firstName);
        System.out.println("Name: " + this.name);
    }

} 
