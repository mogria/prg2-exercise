/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.prg2.containers;

/**
 *
 * @author mogria
 * @param <T>
 */
public class Stack<T> {
    
    private int pos = -1;
    private final int size;
    private final Object[] stack;
    
    Stack(int size) {
        this.size = size;
        
        this.stack = new Object[size];
    }
    
    void push(T v) {
        pos++;
        stack[pos] = v;
    }
    
    T pop() {
        if(pos < 0 || pos >= size) return null;
        T v = peek();
        pos -= 1;
        return v;
        
    }
    
    T peek() {
        return (T)stack[pos];
    }
}
