/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw2;

/**
 *
 * @author Diego
 * @param <T>
 */
public class doubleListNode<T extends Comparable>  {
    
    private T value;
    private doubleListNode prev;
    private doubleListNode next;

    /**
     * 
     * @param value
     * @param prev
     * @param next 
     */
    public doubleListNode(T value, doubleListNode prev, doubleListNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @return the prev
     */
    public doubleListNode getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(doubleListNode prev) {
        this.prev = prev;
    }

    /**
     * @return the next
     */
    public doubleListNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(doubleListNode next) {
        this.next = next;
    }
    
}
