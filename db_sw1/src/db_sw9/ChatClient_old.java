/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_sw9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

/**
 *
 * @author Diego
 */
public class ChatClient_old implements Runnable{
    
    private static final int TIMEOUT = 2000; // in ms
    
    private Socket server;
    private int portNumber;
    private InetAddress serverIP;
    
    public ChatClient_old() {
        setSocket();
    }
    
    public void setSocket(){
        System.out.println("Chat Client startet.");
        try{
            String ip = InetAddress.getLocalHost().getHostAddress();
            System.out.println("Your IP is " + ip);
        }
        catch(UnknownHostException ex){
            System.out.println("Unable to get your IP.");
        }
        System.out.println("******************************************");
        BufferedReader inputStream = new BufferedReader
        (new InputStreamReader(System.in));
        System.out.println("Please enter server-IP:");
        try{
            serverIP = InetAddress.getByName(inputStream.readLine());
            if(serverIP.isReachable(TIMEOUT)){
                System.out.println("IP address set to " + serverIP.toString()
                + " and is reachable.");
            }
            else{
                System.out.println("IP address set to " + serverIP.toString()
                + " but is NOT reachable.");
            }
        }
        catch(IOException ex){
            System.out.println("Failed to set IP to socket.");
        }
        System.out.println("Please enter server port:");
        try{
            portNumber = Integer.parseInt(inputStream.readLine());
            System.out.println("Server port set to " + portNumber);
        }
        catch(IOException ex){
            System.out.println("Failed to set IP to socket.");
        }
            
    }
    
    
    public static void main(String[] args) {  
        ChatClient_old client = new ChatClient_old();
    }
    
    public void testNetworkInterfaces(){
        for(int i = 0; i < 100; i++){
            try{
            System.out.println(NetworkInterface.getByIndex(i).toString());
            }
            catch(SocketException ex){}
            catch(NullPointerException ex){}
        }
    }
    
    public void run(){
        while(true){
            try{
                server = new Socket(serverIP, portNumber);
                PrintWriter chatOutput = 
                new PrintWriter(server.getOutputStream());
                
            }
            catch(IOException ex){}
        }
    }
    
}
