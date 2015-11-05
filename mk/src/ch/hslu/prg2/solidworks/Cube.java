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
public class Cube implements Comparable<Cube> {
    int number;
    int s[];
    
    public Cube(int no, int a, int b, int c) {
        this.number = no;
        s = new int[]{a, b, c};
    }
    
    public int getVolume() {
        return s[0] * s[1] * s[2];
    }
    
    public int getSurface() {
        return 2 * (s[0] * s[1] +
                    s[1] * s[2] +
                    s[0] * s[2]);
    }
    
    public int getMaxDimension() {
        return Math.max(Math.max(s[0], s[1]), s[2]);
    }
    
    @Override
    public String toString() {
        return "CUBES " + number + "\n"
             + "Sides: " + s[0] + " " + s[1] + " " + s[2] + "\n"
             + "Volume = " + getVolume() + "\n"
             + "Surface = " + getSurface() + "\n";
    }
    
    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Cube)) return false;
        Cube otherCube = (Cube)other;
        return getVolume() == otherCube.getVolume();
    }
    
    @Override
    public int hashCode() {
        return (s[1] ^ s[2] ^ s[3]) + 17;
    }
    
    public int compareTo(Cube other) {
        return getVolume() - other.getVolume();
    }
}
