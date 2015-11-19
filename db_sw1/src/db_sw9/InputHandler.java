/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw9;

/**
 *
 * @author Diego
 */
public class InputHandler implements Runnable{
   
    Thread thread;
    
    public InputHandler(){   
        if(this.thread == null){
            this.thread = new Thread();
            thread.start();
        }
    }
    
    @Override
    public void run(){
        
    }
    
}
