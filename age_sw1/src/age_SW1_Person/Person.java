/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW1_Person;

/**
 *
 * @author Adrian
 */
public class Person {
    private String name;
    private String firstname;
    
    public Person()
    {
    
    }
    
    public Person(String name,String firstname)
    {
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
    public String getFristname() {
        return firstname;
    }

    /**
     * @param fristname the firstname to set
     */
    public void setFristname(String fristname) {
        this.firstname = fristname;
    }

    public void print(){
        System.out.println(name + " " + firstname);
    }
    
    @Override
    public String toString()
    {
        return name + " " + firstname;
    }
    
}
