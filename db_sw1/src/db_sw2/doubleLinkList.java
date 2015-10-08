/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw2;
import java.util.Comparator;

/**
 *
 * @author Diego
 * @param <T>
 * 
 */
public class doubleLinkList<T extends Comparable> {
    
    private doubleListNode<T> head;
    private doubleListNode<T> last;

    public doubleLinkList(doubleListNode<T> head, doubleListNode<T> last) {
        this.head = head;
        this.last = last;
    }
    
    public void insert(Object o){
        doubleListNode currentNode = head;
        int comparator = 0;
        
        while(currentNode != null & comparator > 0){
           // comparator = Comparator(currentNode, o);
        }
    }
    
}
