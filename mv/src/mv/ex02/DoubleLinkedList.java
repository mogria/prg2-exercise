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
public class DoubleLinkedList<T extends Comparable> {
    private DoubleListNode<T> head;
    private DoubleListNode<T> tail;

    public DoubleLinkedList() {
    }
    
    public static void main(String[] args){
        DoubleLinkedList<Integer> list = new DoubleLinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(5);   
        list.insert(25);
        list.insert(12);
          
        
        list.print();
    }   
    
    public void insert(T value){
        DoubleListNode newNode = new DoubleListNode(value, null, null);
        
        if(head == null){
            head = newNode;
        }
        else{
            DoubleListNode current = head;
            
            while(current != null){
                int comp = value.compareTo(current.getValue());

                if(comp < 1){
                    boolean isFirst = current.getPrevious() == null;
                    
                    newNode.setNext(current);
                    
                    if(!isFirst){
                        newNode.setPrevious(current.getPrevious());
                        current.getPrevious().setNext(newNode);
                    }
                    
                    current.setPrevious(newNode);
                                        
                    if(isFirst){
                        head = newNode;
                    }

                    current = null;
                }
                else{
                    boolean isLast = current.getNext() == null;
                    
                    if(isLast){
                        newNode.setPrevious(current);
                        current.setNext(newNode);
                        current = null;
                    }
                    else{
                        current = current.getNext();
                    }
                }
            }
        }
    }
    
    public void print(){
        DoubleListNode currentNode = head;
        
        while(currentNode != null){
            System.out.println(currentNode.toString());
            currentNode = currentNode.getNext();
        }
    }

    public DoubleListNode<T> getHead() {
        return head;
    }

    public void setHead(DoubleListNode<T> head) {
        this.head = head;
    }

    public DoubleListNode<T> getTail() {
        return tail;
    }

    public void setTail(DoubleListNode<T> tail) {
        this.tail = tail;
    }
    
    
}
