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
public class LinkedList<T> {
    private ListNode<T> head;

    public LinkedList() {
    }
    
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList();
        list.insert("asd");
        list.insert("sldkjsldgj");
        list.insert("hfhfhfh");
        
        list.print();
        
    }   
    
    public boolean isFound(T value){
        ListNode<T> currentNode = head;
        
        while(currentNode != null && !currentNode.getValue().equals(value)){
            currentNode = currentNode.getNext();
        }
        
        return currentNode != null;
    }
    
    public void insert(T value){
        if(!isFound(value)){
            this.head = new ListNode(value, head);
        }        
    }
    
    public void print(){
        ListNode currentNode = head;
        
        while(currentNode != null){
            System.out.println(currentNode.toString());
            currentNode = currentNode.getNext();
        }
    }
    
    public int length(){
        int length = 0;
        ListNode currentNode = head;
        
        while(head != null){
            length++;
            currentNode = currentNode.getNext();
        }
        
        return length;
    }
}
