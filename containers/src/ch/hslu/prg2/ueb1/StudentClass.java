package ch.hslu.prg2.ueb1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mogria
 */
public class StudentClass {
    private List<Student> studentsList = new ArrayList<>();
    private List<Subject> subjects = new ArrayList<>();
    private Teacher mainTeacher;

    public StudentClass(Teacher mainTeacher) {
        this.mainTeacher = mainTeacher;
    }
    
    public void addStudent(Student student) {
        getStudentsList().add(student);
    }
    
    public void addSubject(Subject subject) {
        getSubjects().add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    /**
     * @return the studentsList
     */
    public List<Student> getStudentsList() {
        return studentsList;
    }

    /**
     * @return the mainTeacher
     */
    public Teacher getMainTeacher() {
        return mainTeacher;
    }

    /**
     * @param mainTeacher the mainTeacher to set
     */
    public void setMainTeacher(Teacher mainTeacher) {
        this.mainTeacher = mainTeacher;
    }
}
