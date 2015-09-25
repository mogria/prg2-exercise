/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW2_Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 *
 * @author Adrian
 */
public class StackedLinkedList<T> {
    private Deque<T> stack = new ArrayDeque<>();
    
    public void push(T element)
    {
        stack.push(element);
    }
    public T pop(){
        return stack.removeFirst();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public boolean isFul(){
        return false;
    }
}
