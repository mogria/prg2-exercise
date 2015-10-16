/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw3;

/**
 *
 * @author Diego
 */
public class Main {
    
    public Main(){
        
    }
    
    public static void main(String[] args) {
        
        ListOne one = new ListOne();
        ListTwo two = new ListTwo();
        
        one.add(3);
        one.add(5);
        one.add(2);
        one.print();
        
        two.add(3);
        two.add(5);
        two.add(2);
        two.print();
        
    }
    
}
