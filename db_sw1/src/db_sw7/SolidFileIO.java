package db_sw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Read solid data from file.
 */
public final class SolidFileIO {

    /**
     * Read solid data from file.
     * @param fileName Filename.
     * @return Array of Cubes.
     */
    public static Cube[] readSolids(final String fileName) {
        int number = 1;
        String line;
        ArrayList<Cube> cubes = new ArrayList<>();
        
        final File textFile = new File(fileName);
        
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(textFile))){
            //System.out.println("Beginnt"); 
            while ((line = bufferedReader.readLine()) != null)  { 
                 String tokens[] = line.split(" ");
                 int s1 = Integer.parseInt(tokens[1]);
                 int s2 = Integer.parseInt(tokens[2]);
                 int s3 = Integer.parseInt(tokens[3]);
                 /**System.out.println(tokens[1]);
                 System.out.println(tokens[2]);
                 System.out.println(tokens[3]);**/
                 
                 cubes.add(new Cube(number, s1, s2, s3));
                 number ++;
            }
            /**for(int i = 0;i < cubes.size(); i++){
                System.out.println(cubes.get(i));
            }**/
        }
        catch(IOException ex){
            System.out.println(ex);
        }
        return cubes.toArray(new Cube[cubes.size()]);
    }

    /**
     * Privater Konstruktor.
     */
    private SolidFileIO() {
    }
    
    public static void main(String[] args) {
        readSolids("C:\\Users\\Diego\\Documents\\NetBeansProjects\\prg2-exercise\\db_sw1\\src\\db_sw7\\soliddata_cubes.txt");
    }
}
