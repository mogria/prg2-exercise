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
public class Person {
    private String name;
    private String firstname;

    public Person() {
    }
    
    
    public Person(String name, String firstname) {
        this.name = name;
        this.firstname = firstname;
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
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    
    public void print() {
        System.out.println("Person[name = '" + name + "', firstname = '" + firstname + "']");
    }
    
}
