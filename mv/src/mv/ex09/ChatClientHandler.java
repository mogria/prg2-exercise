/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mv.ex09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dethrall
 */
public class ChatClientHandler extends Thread{
    private final Socket clientSocket;
    private static final List<PrintWriter> clientWriters = new ArrayList();
    
    ChatClientHandler(Socket socket) {
        this.clientSocket = socket;
    }
    
    @Override
    public void run(){
        
        try(
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())
            );
        ){
            synchronized (clientWriters){
                clientWriters.add(out);
            }            
            System.out.println("connection established");
            System.out.println("clients: " + clientWriters.size());
            String inLine;
            while((inLine = in.readLine()) != null){
                synchronized (clientWriters){
                    for(PrintWriter singleOut : clientWriters){
                        if(!singleOut.equals(out)){
                            singleOut.println(inLine);
                            singleOut.flush();
                        }
                    }
                }
            }
        }
        catch(IOException e){
            System.out.println("Exception occured: " + e.getMessage());
        }
        finally{
            System.out.println("connection closed");
        }
        
    }
    
}
