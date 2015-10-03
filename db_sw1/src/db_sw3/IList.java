/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw3;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public interface IList {
    
    void add(int value);
    
    boolean remove(int value);
    
    boolean removeValue(int value);
    
    boolean removeValues(int value);
    
    int size();
    
    boolean exists(int value);
    
    void print();
    
}
