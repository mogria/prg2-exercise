/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw3;

import java.util.ListIterator;
import java.util.LinkedList;

/**
 *
 * @author Diego
 */
public class ListTwo implements IList {
    
    private LinkedList<Integer> list = new LinkedList<>();
    
    public ListTwo() {
    
    }
    
    @Override
    public void add(int value) {
        list.add(value);
    }

    @Override
    public boolean exists(int value) {
        
        ListIterator itr = list.listIterator();
        int currentValue;
        do {
            currentValue = (int)itr.next();
        }while(itr.hasNext() && currentValue != value);
        
        return (currentValue == value);
    }

    @Override
    public void print() {
        
        ListIterator itr = list.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    @Override
    public boolean remove(int value) {
        // ?!?! was ist Unterschied von Integer Objekt und ganzzahliger Variable?
        return true;
    }

    @Override
    public boolean removeValue(int value) {
        ListIterator itr = list.listIterator();
        int currentValue;
        do {
            currentValue = (int)itr.next();
        }while(itr.hasNext() && currentValue != value);
        
        if(currentValue == value){
            itr.remove();
        }
        return (currentValue == value);
    }

    @Override
    public boolean removeValues(int value) {
        boolean success;
        int overall = 0;
        
        do{
            success = removeValues(value);
            if(success == true){
                overall ++;
            }
        }while(success == true);
        return (overall > 0);
    }
    
    @Override
    public int size(){
        return list.size();
    }
}
