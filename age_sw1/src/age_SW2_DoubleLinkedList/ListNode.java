/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW2_DoubleLinkedList;

/**
 *
 * @author Adrian
 */
public class ListNode<T> {
    private T value;
    private ListNode next;
    private ListNode prev;

    public ListNode(T value, ListNode next, ListNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
    
    @Override
    public String toString()
    {
        return value.toString();
    }

    public int getSortOrder()
    {
        if (value instanceof Integer)
            return (Integer)value;
        else if (value instanceof String)
            return (int)(Character)value;
        else 
            return 0;
    }
    
    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * @return the next
     */
    public ListNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(ListNode next) {
        this.next = next;
    }

    /**
     * @return the prev
     */
    public ListNode getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
    



}
