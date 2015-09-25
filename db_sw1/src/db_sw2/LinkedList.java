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
public class LinkedList<T> {
    
    private ListNode<T> head;

    /**
     * 
     * @param head 
     */
    public LinkedList(ListNode head) {
        this.head = head;
    }
    
    /**
     * 
     * @param Konto
     * @return 
     */
    public boolean isFound(T Konto){
        ListNode currentNode = head;
        
        while(currentNode != null && currentNode.getKonto().equals(Konto)){
            currentNode = currentNode.getNext();
        }
        return (currentNode != null);
    }
    
    /**
     * 
     * @param Konto 
     */
    public void insert(T Konto){
        this.head = new ListNode(Konto, head);
    }
    
    /**
     * 
     */
    public void print(){
        ListNode currentNode = head;
        
        while(currentNode != null){
            System.out.println(currentNode.getKonto().toString());
            currentNode = currentNode.getNext();
        }
    }
    
    /**
     * 
     * @return 
     */
    public int length(){
        ListNode currentNode = head;
        int I = 0;
        
        while(currentNode != null){
            currentNode = currentNode.getNext();
            I ++;
        }
        return I;
    }
    
    public static void main(String[] args) {
        ListNode node1 = new ListNode<String>("Homo", null);
        
        LinkedList linkedList1 = new LinkedList<String>(node1);
        linkedList1.insert("spongebob");
        linkedList1.insert("patrik");
        linkedList1.insert("si");
        
        System.out.println("Found: " + linkedList1.isFound("Homo"));
        System.out.println("Length: " + linkedList1.length());
        linkedList1.print();
        
    }
}
