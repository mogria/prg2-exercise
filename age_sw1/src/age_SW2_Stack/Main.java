/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package age_SW2_Stack;

/**
 *
 * @author Adrian
 */
public class Main {
    public static void main(String[] args){
        StackedLinkedList<Integer> list = new StackedLinkedList();
        
        list.push(1);
        list.push(2);
        list.push(4);
        
        
        while(!list.isEmpty()){
            System.out.println(list.pop().toString());
        }
    }
    
}
