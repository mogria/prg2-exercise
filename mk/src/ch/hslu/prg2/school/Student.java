package ch.hslu.prg2.school;

/**
 *
 * @author mogria
 */
public class Student extends Person {
    private final int studentNumber;
    private String course;
    
    static private int number = 1000;

    public Student(String name, String firstname) {
        super(name, firstname);
        studentNumber = number++;
    }
    
    public Student(String name, String firstname, String course) {
        this(name, firstname);
        this.course = course;
    }

    /**
     * @return the studentNumber
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }
    
    @Override
    public void print() {
        System.out.println("Student[name = '" + getName() + "', firstname = '" + getFirstname() + "', studentNr = '" + studentNumber + "', course = '" + course + "']");
    }
}
