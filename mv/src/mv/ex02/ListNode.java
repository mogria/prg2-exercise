/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex02;

/**
 *
 * @author Dethrall
 */
public class ListNode<T> {
    private T value;
    private ListNode next;
    
    public ListNode(T value, ListNode next){
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString(){
        return value.toString();
    }
    
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
    
    
}
