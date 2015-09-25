/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW2_DoubleLinkedList;

/**
 *
 * @author Adrian
 */
public class Main {
        
      public static void main(String[] args) {
        // TODO code application logic here
             
            DoubleLinkedList<Integer> list = new DoubleLinkedList();
            
            list.add(11);
            list.add(5);
            list.add(7);    
            list.add(2);
            list.add(56);
            list.add(52);
            list.add(47);
            list.add(129);
            System.out.println(list.toString());
            list.remove(2);
            list.remove(129);
            System.out.println(list.toString());
                                
    }
}
