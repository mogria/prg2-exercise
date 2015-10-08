/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex02;

/**
 *
 * @author Dethrall
 * @param <T>
 */
public class DoubleListNode<T extends Comparable> {
    private T value;
    private DoubleListNode next;
    private DoubleListNode previous;
    
    public DoubleListNode(T value, DoubleListNode next, DoubleListNode previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
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

    public DoubleListNode getNext() {
        return next;
    }

    public void setNext(DoubleListNode next) {
        this.next = next;
    }

    public DoubleListNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleListNode previous) {
        this.previous = previous;
    }
   
}
