/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW7_File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class SolidFileIO {
    
    public static Cube[] readSolids(String filename) throws FileNotFoundException, IOException{
        ArrayList<Cube> list = new ArrayList();
        int number = 1;
        String line;
        
        
        File file = new File(filename);
        
        if (!file.exists())
            throw new FileNotFoundException("");
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((line = br.readLine()) != null){
            String[] tokens = line.split("[: ]");
            switch(tokens[0]){
                case "C":
                    int s1 = Integer.parseInt(tokens[2]);
                    int s2 = Integer.parseInt(tokens[2]);
                    int s3 = Integer.parseInt(tokens[2]);
                    list.add(new Cube(number,s1,s2,s3));
                    break;
                default:
                    break;
            }
            number++;
        }
        
        return list.toArray(new Cube[list.size()]);
    }
    
}
