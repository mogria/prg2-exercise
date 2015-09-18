package ch.hslu.prg2.school;

/**
 *
 * @author mogria
 */
public class Teacher extends Person {

    
    private Subject subject;
    private int salary;
    
    public Teacher(String name, String firstname) {
        super(name, firstname);
    }

    public Teacher(Subject subject, int salary, String name, String firstname) {
        this(name, firstname);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println("Student[name = '" + getName() + "', firstname = '" + getFirstname() + "', subject = '" + subject + "', salary = '" + salary + "']");
    }
    
    
    
}
