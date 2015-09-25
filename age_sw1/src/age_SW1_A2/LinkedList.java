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
public class LinkedList<T> {
    ListNode<T> head;

    public LinkedList() {
    }
    
    public boolean isFound(T data)
    {
        ListNode<T> currentNode = head;
        
        while ((currentNode != null) && !data.equals(currentNode.getValue())){
            currentNode = currentNode.getNext();
        }
        return currentNode != null;
    }
    
    public void insert(T data)
    {
        if (!isFound(data))
        {
            this.head = new ListNode(data,head);
        }
        
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
    
    public int lenght(){
        int lenght = 0;
        ListNode<T> currentNode = head;
        
        while((currentNode != null))
        {
            lenght++;
            currentNode = currentNode.getNext();
        }
        return lenght;
    }
}
