/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_sw1;

/**
 *
 * @author Adrian
 */
public class Age_sw1 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        School school = new School("HSLU");
        
        school.EnroleStudent(new Student("Testcourse","Hans","Föhlich"));
        school.EnroleStudent(new Student("Testcourse1","Hans1","Föhlich1"));
        school.EnroleStudent(new Student("Testcourse2","Hans2","Föhlich2"));
        school.EnroleStudent(new Student("Testcourse3","Hans3","Föhlich3"));
        school.EnroleStudent(new Student("Testcourse4","Hans4","Föhlich4"));
        
        school.print();
        

                                
    }
    
}
