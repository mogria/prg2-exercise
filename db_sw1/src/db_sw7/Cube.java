package db_sw7;

/**
 * A simple Cube with three side lengths.
 */
public class Cube implements Comparable<Cube>{
    
    private int number;
    private int s1;
    private int s2;
    private int s3;
    
    public Cube(int no, int a, int b, int c){
        this.number = no;
        this.s1 = a;
        this.s2 = b;
        this.s3 = c;
    }
    
    public int getVolume(){
        return s1 * s2 * s3;
    }
    
    public int getSurface(){
        return (s1 * s2 * 2) + (s1 * s3 * 2) + (s2 * s3 * 2);
    }
    
    public int getMaxDimension(){
        if(s1 > s2 && s1 > s3){
            return s1;
        }
        if(s2 > s1 && s2 > s3){
            return s2;
        }
        else{
            return s3;
        }
    }
    
    public String toString(){
        return "CUBE " + number + "\nSides: " + s1 + " " + s2 + " " + s3 + 
                "\nVolume = " + this.getVolume() + "\nSurface = " + 
                this.getSurface();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.getVolume();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cube other = (Cube) obj;
        if (this.getVolume() != other.getVolume()){
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Cube other) {
        return this.getVolume() - other.getVolume();
    }

}
