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
            System.out.println(list.toString());
            list.add(5);
            System.out.println(list.toString());
            list.add(7);
            System.out.println(list.toString());
            list.add(2);
            
            System.out.println(list.toString());
                                
    }
}
