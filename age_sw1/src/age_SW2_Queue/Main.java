/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW2_Queue;

/**
 *
 * @author Adrian
 */
public class Main {
    
    public static void main(String[] args){
        QueueLinkedList<Integer> list = new QueueLinkedList();
        
        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(4);
        
          while(!list.isEmpty()){
            System.out.println(list.dequeue().toString());
        }
    }
    
}
