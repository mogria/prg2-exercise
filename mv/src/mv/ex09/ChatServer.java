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
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dethrall
 */
public class ChatServer{
    
    private static final int DEFAULT_PORT = 32946;
    
    private ServerSocket server;
    public Socket client;
    
    private int portNumber;
    
    public ChatServer(){
        init();
        
        BufferedReader inStream;
            try {
                inStream = new BufferedReader(new InputStreamReader(client.getInputStream()));
                
                String msg = inStream.readLine();
                if(msg != null){
                    System.out.println();
                }
            } catch (IOException ex) {
                Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
    
    private void init(){
        try {
            System.out.println("Your IP Address is: " + InetAddress.getLocalHost().getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        portNumber = getPortNumberInput();
        
        connect();
    }
    
    private void connect(){
        try {
            server = new ServerSocket(portNumber);
            System.out.println("Waiting for connection...");
            client = server.accept();
            System.out.println("Connected to: " + client.getInetAddress().toString() + ":" + client.getPort());
            
            BufferedReader inStream = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            try {
                String msg = inStream.readLine();
                if(msg != null){
                    System.out.println();
                }
            } catch (IOException ex) {
                Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private int getPortNumberInput(){
        int portNo = DEFAULT_PORT;
        
        System.out.println("Please enter the Port Number (Leave empty for default):");
        
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            if(!br.readLine().equals("")){
                portNo = Integer.parseInt(br.readLine());
            }
        }
        catch(IOException e){
            System.out.println("InputReader error!!! " + e.getLocalizedMessage());
        }
        
        return portNo;
    }

    public ServerSocket getServer() {
        return server;
    }

    public void setServer(ServerSocket server) {
        this.server = server;
    }

    public Socket getClient() {
        return client;
    }

    public void setClient(Socket client) {
        this.client = client;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    
}
