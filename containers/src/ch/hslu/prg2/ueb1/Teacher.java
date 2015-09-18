package ch.hslu.prg2.ueb1;

/**
 *
 * @author mogria
 */
public class Teacher extends Person {

    
    private String subject;
    private int salary;
    
    public Teacher(String name, String firstname) {
        super(name, firstname);
    }

    public Teacher(String subject, int salary, String name, String firstname) {
        this(name, firstname);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Student[name = '" + getName() + "', firstname = '" + getFirstname() + "', subject = '" + subject + "', salary = '" + salary + "']");
    }
    
    
    
}
