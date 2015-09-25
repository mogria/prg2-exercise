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
public class RingBuffer<T> {
    private int head;
    private int tail;
    private final int size;
    private T[] queue;
    boolean full;

    public RingBuffer(int size) {
        this.size = size;
        this.head = 0;
        this.tail = 0;
        this.queue = (T[])new Object[size];
        this.full = false;
    }
    
    public void enqueue(T x) {
        if(isFull()) throw new ArrayIndexOutOfBoundsException("RingBuffer is full");
        queue[tail] = x;
        tail++;
        tail %= size;
        if(tail == head) full = true;
    }
    public T dequeue() {
        if(isEmpty()) throw new ArrayIndexOutOfBoundsException("RingBuffer is empty");
        T v = queue[head];
        head++;
        head %= size;
        full = false;
        return v;
    }
    
    public boolean isEmpty() {
        return head == tail && !full;
    }
    public boolean isFull() {
        return full;
    }
}
