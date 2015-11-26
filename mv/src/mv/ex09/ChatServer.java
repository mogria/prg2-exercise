/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex09;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author Dethrall
 */
public class ChatServer extends Thread{
    int portNumber;
            
    public ChatServer(int portNumber){
        this.portNumber = portNumber;
    }
    
    @Override
    public void run(){        
        try(ServerSocket serverSocket = new ServerSocket(portNumber)){
            System.out.println("the chat server has started");
            
            while(true){
                new ChatClientHandler(serverSocket.accept()).start();
            }
        }
        catch(IOException e){
            System.out.println("exception occured: " + e.getMessage());
        }
    }
}