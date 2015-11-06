/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.containers;

/**
 *
 * @author mogria
 */
public interface IList<T extends Object> {
    
    void add(T value);
    
    boolean remove(int index);
    
    boolean removeValue(T value);
    
    boolean removeValues(T value);
    
    int size();
    
    boolean exists(T value);
    
    @Override
    String toString();
    
}
