/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw2;


/**
 *
 * @author Diego
 */

/**
public class Ringbuffer<T> {
    
    private T[] queue;
    private int head = 0;
    private int tail = 0;

    public Ringbuffer(T[] queue) {
        this.queue = queue;
    }
    
    public void enqueue(T x) {         
        this.queue[tail] = x;
        tail = (tail + 1) % queue.length;
    }  
    
    public T dequeue() {         
        T object = queue[head];
        queue[head] = null;
        head = (head + 1) % queue.length;
        return object;
    }  
    
    public boolean isEmpty() {       
        return (queue[head] == null);    
    }  
    
    public boolean isFull() {         
        return (head == tail && queue[head] != null);     
    }  
}**/