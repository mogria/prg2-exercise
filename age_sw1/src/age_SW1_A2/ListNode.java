/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW1_A2;



/**
 *
 * @author Adrian
 */
public class ListNode<T> {
    private T value;
    private ListNode next;

    public ListNode(T value, ListNode next) {
        this.value = value;
        this.next = next;
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
    @Override
    public String toString()
    {
        return value.toString();
    }
    
    
}
