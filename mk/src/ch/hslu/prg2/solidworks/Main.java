/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.solidworks;

/**
 *
 * @author mogria
 */
public class Main {
    public static void main(String[] args) {
      Cube[] cubes = SolidFileIO.readSolids("TestFile");
      if(cubes != null) {
          for(Cube cube : cubes) {
              System.out.println(cube);
          }
      } else {
          System.out.println("Couldn't read file");
      }
    }
}
