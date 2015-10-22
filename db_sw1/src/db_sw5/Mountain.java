
import java.util.Objects;

/* Copyright 2015 Hochschule Luzern - Technik & Architektur */

/**
 * 
 * @author Peter Sollberger (peter.sollberger@hslu.ch)
 */
public final class Mountain implements Comparable<Mountain> {

    private final String name;
    private final int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }

    @Override
    public int compareTo(Mountain other) {
        if(this.name.equals(other.name)){
            if(this.height == other.height){
                return 0;
            }else{
                return other.height - this.height;
            }
        }
        if(this.name == null){
            return -1;
        }
        if(other.name == null){
            return 1;
        }
        return this.compareTo(other);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + this.height;
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
        final Mountain other = (Mountain) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        return true;
    }
    
    
}
