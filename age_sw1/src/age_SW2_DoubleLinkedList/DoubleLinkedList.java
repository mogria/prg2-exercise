/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW2_DoubleLinkedList;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Adrian
 * @param <T>
 */
public class DoubleLinkedList<T extends Comparable<T>> {
    ListNode<T> head = null;
    ListNode<T> tail = null;

    public DoubleLinkedList() {
    }
    
    
    public ListNode<T> findPrev(T data)
    {
        if(head == null)
            return null;
        
        ListNode<T> currentNode = head;
        
        
        while ((currentNode != null) && data.compareTo(currentNode.getValue()) > 0){
            currentNode = currentNode.getNext();
        }
        return currentNode;

    }
    
    public ListNode<T> find(T data)
    {
        ListNode<T> currentNode = head;
        
        while ((currentNode != null) && data.compareTo(currentNode.getValue())!=0){
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }
    
    public boolean add(T element)
    {
        ListNode<T> currentNode = this.findPrev(element);
        ListNode<T> newNode = new ListNode(element,null,null);
      
        if (head == null){//First
            head = newNode;
            return true;
        }
           
            
        if (currentNode != null)
        {
            newNode.setNext(currentNode);
            newNode.setPrev(currentNode.getPrev());
            
            if (currentNode.getPrev() != null){
                currentNode.getPrev().setNext(newNode);
            }else{
                head = newNode;
            }
            
            currentNode.setPrev(newNode);
        }
        
        return true;
        
    }
    
    public T remove(T element)
    {
        ListNode<T> currentNode = this.find(element);
        currentNode.getPrev().setNext(currentNode.getNext());
        currentNode.getNext().setPrev(currentNode.getPrev());
        return currentNode.getValue();        
    }
    
    public void clear()
    {
        head = null;
    }
    
    public int getSize()
    {
        
       int lenght = 0;
        ListNode<T> currentNode = head;
        
        while((currentNode != null))
        {
            lenght++;
            currentNode = currentNode.getNext();
        }
        return lenght; 
    }
    @Override
    public String toString()
    {
        String retVal = "";
        ListNode<T> currentNode = head;
        while ((currentNode != null))
        {
            retVal += currentNode.toString() +"\r\n";
            currentNode = currentNode.getNext();
        }
        return retVal;
    }
    
}
