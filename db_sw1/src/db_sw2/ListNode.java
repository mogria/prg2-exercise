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
public class ListNode<T> {
    private T Konto;
    private ListNode next;

    public ListNode(T Konto, ListNode next) {
        this.Konto = Konto;
        this.next = next;
    }

    /**
     * @return the Konto
     */
    public T getKonto() {
        return Konto;
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
 
}
