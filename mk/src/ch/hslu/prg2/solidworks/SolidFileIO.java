/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.solidworks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mogria
 */
public class SolidFileIO {

    public static Cube[] readSolids(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            List<Cube> list = new ArrayList<Cube>();
            int number = 1;
            String line;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("[: ]"); //
                switch (tokens[0]) { // is it a Cube, a Sphere or a Cylinder?
                    case "C":
                        int s1 = Integer.parseInt(tokens[2]);
                        int s2 = Integer.parseInt(tokens[3]);
                        int s3 = Integer.parseInt(tokens[4]);
                        list.add(new Cube(number, s1, s2, s3));
                        break;
                    default:
                        break;
                }
                number++;
            }
            
            return list.toArray(new Cube[list.size()]);
        } catch (FileNotFoundException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        }
    }
}
