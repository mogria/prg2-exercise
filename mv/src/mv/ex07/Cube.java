/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex07;

/**
 *
 * @author Dethrall
 */
public class Cube implements Comparable<Cube>{
    int number;
    int s1, s2, s3;
    
    public Cube(int no, int a, int b, int c){
        number = no;
        s1 = a;
        s2 = b;
        s3 = c;
    }
    
    public int getVolume(){
        return s1 * s2 * s3;
    }
    
    public int getSurface(){
        return (s1 * s2 + s1 * s3 + s2 * s3) * 2;
    }
    
    public int getMaxDimension(){
        return Math.max(Math.max(s1, s2), s3);
    }
    
    @Override
    public String toString(){
        return "CUBE " + number + "\nSides" + s1 + " " + s2 + " " + s3 + "\nVolume = " + getVolume() + "\nSurface = " + getSurface();
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        
        final Cube other = (Cube) obj;
        if(this.getVolume() != other.getVolume()){
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 53 * hash + this.getVolume();
        return hash;
    }
    
    @Override
    public int compareTo(Cube other){
        return this.getVolume() - other.getVolume();
    }
}
