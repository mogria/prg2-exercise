/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw9;

import java.io.IOException;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego
 */
public class ChatWindow implements Runnable{
    
    Thread thread;
    private int port;
    private InetAddress server;
    private Socket socket;
    
    public ChatWindow(InetAddress server, int port){
        this.port = port;
        this.server = server;
        
        if(this.thread == null){
            thread = new Thread(this);
            thread.start();
        }
    }
    
    @Override
    public void run(){
        try {
            socket = new Socket(server, port);
        } catch (IOException ex) {
            System.out.println("Connection could not be established: " + ex);
        }
        
    }
    
}
