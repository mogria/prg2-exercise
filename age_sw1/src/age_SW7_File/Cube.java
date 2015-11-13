/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW7_File;

/**
 *
 * @author Adrian
 */
public class Cube implements Comparable {

    int number;
    int s1;
    int s2;
    int s3;

    public Cube(int number, int s1, int s2, int s3) {
        this.number = number;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public int GetVolume() {
        return s1 * s2 * s3;
    }

    public int GetSurface() {
        return s1 * s2 * 2 + s2 * s3 * 2 + s1 * s3 * 2;
    }

    public int getMaxDimension() {
        if (s1 > s2 && s1 > s3) {
            return s1;
        }
        if (s2 > s1 && s2 > s3) {
            return s2;
        } else {
            return s3;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("---------------------------------------------");
        sb.append("CUBE ").append(String.valueOf(number));
        sb.append("\nSides ").append(String.valueOf(s1)).append(" ").append(String.valueOf(s2)).append(" ").append(String.valueOf(s3));
        sb.append("\nVolume ").append(String.valueOf(this.GetVolume()));
        sb.append("\nSurface ").append(String.valueOf(this.GetSurface()));

        return sb.toString();

    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other == null) {
            return false;
        }

        if (this.getClass() != other.getClass()) {
            return false;
        }

        return this.GetVolume() == ((Cube) other).GetVolume();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.number;
        hash = 37 * hash + this.s1;
        hash = 37 * hash + this.s2;
        hash = 37 * hash + this.s3;
        return hash;
    }

    @Override
    public int compareTo(Object o) {
        if (this.equals(o)) {
            return 0;
        }

        if (this.GetVolume() > ((Cube) o).GetVolume()) {
            return 1;
        } else {
            return -1;
        }
    }

}
