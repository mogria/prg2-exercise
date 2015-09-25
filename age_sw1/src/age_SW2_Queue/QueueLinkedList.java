/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW2_Queue;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Adrian
 */
public class QueueLinkedList<T> {
    private Deque<T> queue = new LinkedList();
    
    public void enqueue(T element){
        queue.addLast(element);
    }
    
    public T dequeue(){
        return queue.removeFirst();
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public boolean isFull(){
        return false;
    }
    
}
