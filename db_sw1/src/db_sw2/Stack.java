/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw2;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Stack<T> {
    
    private ArrayList<T> stack = new ArrayList<T>();
    private int counter = 0;

    public Stack() {
    }
    
    public void push(T object){
        stack.add(object);
        counter ++;
    }
    
    public T pop(){
        counter --;
        return stack.get(counter);
    }
    
    
}
