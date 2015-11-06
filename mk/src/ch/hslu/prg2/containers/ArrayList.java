/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.containers;

/**
 *
 * @author mogria
 * @param <E> type of value this list holds
 */
public class ArrayList<T> implements IList<T> {
    private java.util.ArrayList<T> list = new java.util.ArrayList<>();

    public ArrayList() {
    }

    @Override
    public void add(T value) {
        list.add(value);
    }

    @Override
    public boolean remove(int index) {
        try {
            list.remove(index);
            return true;
        } catch(IndexOutOfBoundsException ex) {
            return false;
        }
    }

    @Override
    public boolean removeValue(T value) {
        return list.remove(value);
    }

    @Override
    public boolean removeValues(T value) {
        boolean ret = false;
        while (list.remove(value)) {
            ret = true;
        }
        return ret;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean exists(T value) {
        return list.contains(value);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ArrayList");
        
        String seperator = "[";
        for(T value : list)  {
            builder.append(seperator);
            seperator = ", ";
            builder.append(value.toString());
        
        }
        builder.append("]");
        return builder.toString();
    }
    
}
